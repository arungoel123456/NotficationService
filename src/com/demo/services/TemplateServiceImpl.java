package com.demo.services;

import com.demo.dto.NotificationTemplate;
import com.demo.interfaces.TemplateService;

import java.util.HashMap;
import java.util.Map;

public class TemplateServiceImpl implements TemplateService {
    private Map<String, NotificationTemplate> templateStore = new HashMap<>();

    public NotificationTemplate getTemplate(String templateId) {
        return templateStore.get(templateId);
    }
    public String renderBody(String templateBody, Map<String, String> placeholders){
        String rendered= templateBody;
        for (Map.Entry<String, String> entry : placeholders.entrySet()) {
            rendered = rendered.replace("{" + entry.getKey() + "}", entry.getValue());
        }
        return rendered;
    }

}
