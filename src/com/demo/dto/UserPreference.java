package com.demo.dto;

import com.demo.enums.NotificationType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserPreference {
    private String userId;
    private Map<NotificationType, List<String>> enabledChannels;

    public UserPreference(String userId) {
        this.userId = userId;
        enabledChannels= new HashMap<>();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<NotificationType, List<String>> getEnabledChannels() {
        return enabledChannels;
    }

    public void setEnabledChannels(Map<NotificationType, List<String>> enabledChannels) {
        this.enabledChannels = enabledChannels;
    }
}
