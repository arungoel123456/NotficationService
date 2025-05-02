package com.demo.services;

import com.demo.dto.ScheduledNotification;
import com.demo.interfaces.SchedulerService;

import java.util.ArrayList;
import java.util.List;

public class SchedulerServiceImpl implements SchedulerService {
    private List<ScheduledNotification> scheduledNotifications = new ArrayList<>();

    public void scheduleNotification(ScheduledNotification scheduledNotification) {
        System.out.println("Scheduled Notification for: " + scheduledNotification.getScheduledTime());
        scheduledNotifications.add(scheduledNotification);
        // In real system, enqueue to DB or message queue (e.g., Quartz, Kafka)
    }
}
