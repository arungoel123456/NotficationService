package com.demo.interfaces;

import com.demo.dto.NotificationTemplate;

import java.util.Map;

public interface TemplateService {
    NotificationTemplate getTemplate(String templateId);
    String renderBody(String templateBody, Map<String, String> placeholders);
}
