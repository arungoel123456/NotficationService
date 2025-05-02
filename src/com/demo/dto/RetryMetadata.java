package com.demo.dto;

import java.time.LocalDateTime;

public class RetryMetadata {
    private String notificationId;
    private int retryCount;
    private LocalDateTime lastTriedAt;
    private String failureReason;

    public RetryMetadata(String notificationId, int retryCount, LocalDateTime lastTriedAt, String failureReason) {
        this.notificationId = notificationId;
        this.retryCount = retryCount;
        this.lastTriedAt = lastTriedAt;
        this.failureReason = failureReason;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public LocalDateTime getLastTriedAt() {
        return lastTriedAt;
    }

    public void setLastTriedAt(LocalDateTime lastTriedAt) {
        this.lastTriedAt = lastTriedAt;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }
}
