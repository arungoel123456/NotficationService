package com.demo.dto;

import java.time.LocalDateTime;

public class ScheduledNotification {
    private NotificationRequest originalRequest;
    private LocalDateTime scheduledTime;
    private boolean isSent;

    public ScheduledNotification(NotificationRequest originalRequest) {
        this.originalRequest = originalRequest;
        this.isSent = false;
    }

    public NotificationRequest getOriginalRequest() {
        return originalRequest;
    }

    public void setOriginalRequest(NotificationRequest originalRequest) {
        this.originalRequest = originalRequest;
    }

    public LocalDateTime getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(LocalDateTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public boolean isSent() {
        return isSent;
    }

    public void setSent(boolean sent) {
        isSent = sent;
    }
}
