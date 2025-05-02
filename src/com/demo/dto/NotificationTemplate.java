package com.demo.dto;

import com.demo.enums.NotificationType;

public class NotificationTemplate {
    private String templateId;
    private NotificationType type; // e.g., ORDER_SHIPPED, PASSWORD_RESET
    private String subject; // for email
    private String body;

    public NotificationTemplate(String templateId, NotificationType type, String subject, String body) {
        this.templateId = templateId;
        this.type = type;
        this.subject = subject;
        this.body = body;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public NotificationType getType() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
