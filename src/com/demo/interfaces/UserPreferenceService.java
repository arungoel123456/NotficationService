package com.demo.interfaces;

import com.demo.dto.UserPreference;
import com.demo.enums.NotificationType;

public interface UserPreferenceService {
    UserPreference getUserPreference(String userId);
    boolean isChannelEnabled(String userId, NotificationType type, String channel);
}
