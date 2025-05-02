package com.demo.interfaces;

import com.demo.dto.NotificationChannel;
import com.demo.dto.RetryMetadata;

public interface RetryService {
    void handleRetry(NotificationChannel failedNotification, RetryMetadata retryMetadata);
}
