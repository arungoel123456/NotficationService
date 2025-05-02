package com.demo.services;

import com.demo.dto.*;
import com.demo.interfaces.*;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

public class NotificationServiceImpl implements NotificationService {
    private TemplateService templateService;
    private UserPreferenceService userPreferenceService;
    private Map<String, ChannelService> channelServiceMap;
    private SchedulerService schedulerService;
    private RetryService retryService;

    public NotificationServiceImpl(TemplateService templateService,
                                   UserPreferenceService userPreferenceService,
                                   Map<String, ChannelService> channelServiceMap,
                                   SchedulerService schedulerService,
                                   RetryService retryService) {
        this.templateService = templateService;
        this.userPreferenceService = userPreferenceService;
        this.channelServiceMap = channelServiceMap;
        this.schedulerService = schedulerService;
        this.retryService = retryService;
    }

    public void sendNotification(NotificationRequest request) {
        if (request.getScheduledTime() != null) {
            ScheduledNotification scheduledDTO = new ScheduledNotification(request);
            scheduledDTO.setOriginalRequest(request);
            scheduledDTO.setScheduledTime(request.getScheduledTime());
            scheduledDTO.setSent(false);
            schedulerService.scheduleNotification(scheduledDTO);
            return;
        }

        NotificationTemplate template = templateService.getTemplate(request.getTemplateId());
        String body = templateService.renderBody(template.getBody(), request.getPlaceholders());

        UserPreference preferences = userPreferenceService.getUserPreference(request.getUserId());

        for (String channel : request.getChannels()) {
            if (!userPreferenceService.isChannelEnabled(request.getUserId(), template.getType(), channel)) {
                continue;
            }

            ChannelService service = channelServiceMap.get(channel.toUpperCase());
            if (service == null) continue;

            NotificationChannel channelDTO = new NotificationChannel(channel, getDestinationForChannel(channel, request.getUserId()), body, template.getSubject());

            try {
                service.send(channelDTO);
            } catch (Exception e) {
                RetryMetadata retry = new RetryMetadata(UUID.randomUUID().toString(), 0, LocalDateTime.now(), e.getMessage());

                retryService.handleRetry(channelDTO, retry);
            }
        }
    }

    private String getDestinationForChannel(String channel, String userId) {
        // Stub logic, should fetch from DB/user profile service
        if (channel.equalsIgnoreCase("EMAIL")) return userId + "@email.com";
        if (channel.equalsIgnoreCase("SMS")) return "9999999999";
        if (channel.equalsIgnoreCase("PUSH")) return "device-token-xyz";
        return "";
    }

}
