package com.demo.interfaces;

import com.demo.dto.NotificationChannel;

public interface ChannelService {
    void send(NotificationChannel channelDTO) throws Exception;
}
