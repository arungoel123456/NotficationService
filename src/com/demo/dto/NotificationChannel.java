package com.demo.dto;

public class NotificationChannel {
    private String channelType; // e.g., EMAIL, SMS
    private String destination; // e.g., email address or phone number
    private String messageBody;
    private String subject;

    public NotificationChannel(String channelType, String destination, String messageBody, String subject) {
        this.channelType = channelType;
        this.destination = destination;
        this.messageBody = messageBody;
        this.subject = subject;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
