package com.demo.services;

import com.demo.dto.UserPreference;
import com.demo.enums.NotificationType;
import com.demo.interfaces.UserPreferenceService;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UserPreferenceServiceImpl implements UserPreferenceService {
    private Map<String, UserPreference> userPrefs = new HashMap<>();

    public UserPreference getUserPreference(String userId){
        return userPrefs.get(userId);
    }

    public boolean isChannelEnabled(String userId, NotificationType type, String channel){
        UserPreference userPreference= userPrefs.get(userId);
        return userPreference.getEnabledChannels().getOrDefault(type, Collections.emptyList()).contains(channel);
    }
}
