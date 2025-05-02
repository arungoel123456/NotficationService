package com.demo.services;

import com.demo.dto.NotificationChannel;
import com.demo.interfaces.ChannelService;

public class EmailChannelService implements ChannelService {
    public void send(NotificationChannel channelDTO) throws Exception {
        System.out.println("Sending Email to: " + channelDTO.getDestination());
        System.out.println("Subject: " + channelDTO.getSubject());
        System.out.println("Body: " + channelDTO.getMessageBody());
    }
}
