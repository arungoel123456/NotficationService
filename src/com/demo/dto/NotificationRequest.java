package com.demo.dto;

import com.demo.enums.NotificationPriority;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class NotificationRequest {
    private String userId;
    private String templateId;
    private Map<String, String> placeholders; // e.g., { "name": "Rahul", "orderId": "1234" }
    private List<String> channels; // e.g., ["EMAIL", "SMS"]
    private LocalDateTime scheduledTime; // optional
    private NotificationPriority priority;

    public NotificationRequest(String userId, String templateId, Map<String, String> placeholders, List<String> channels, LocalDateTime scheduledTime, NotificationPriority priority) {
        this.userId = userId;
        this.templateId = templateId;
        this.placeholders = placeholders;
        this.channels = channels;
        this.scheduledTime = scheduledTime;
        this.priority = priority;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public Map<String, String> getPlaceholders() {
        return placeholders;
    }

    public void setPlaceholders(Map<String, String> placeholders) {
        this.placeholders = placeholders;
    }

    public List<String> getChannels() {
        return channels;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    public LocalDateTime getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(LocalDateTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public NotificationPriority getPriority() {
        return priority;
    }

    public void setPriority(NotificationPriority priority) {
        this.priority = priority;
    }
}
