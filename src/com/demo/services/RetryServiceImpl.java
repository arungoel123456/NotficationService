package com.demo.services;

import com.demo.dto.NotificationChannel;
import com.demo.dto.RetryMetadata;
import com.demo.interfaces.RetryService;

public class RetryServiceImpl implements RetryService {
    private static final int MAX_RETRIES = 3;

    public void handleRetry(NotificationChannel failedNotification, RetryMetadata retryMetadata) {
        if (retryMetadata.getRetryCount() >= MAX_RETRIES) {
            System.out.println("Max retries reached. Giving up.");
            return;
        }

        try {
            Thread.sleep(1000 * (long) Math.pow(2, retryMetadata.getRetryCount())); // Exponential backoff
            System.out.println("Retrying to send via: " + failedNotification.getChannelType());
            // Simulate retry (in real case, re-call the appropriate ChannelService)
        } catch (InterruptedException e) {
            System.out.println("Retry interrupted.");
        }
    }

}
