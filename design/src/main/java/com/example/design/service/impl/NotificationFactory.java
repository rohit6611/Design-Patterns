package com.example.design.service.impl;

import com.example.design.service.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class NotificationFactory {

    public NotificationService getNotificationType(String type) {
        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotificationService();
            case "sms" -> new SmsNotificationService();
            case "push" -> new PushNotificationService();
            default -> throw new IllegalArgumentException("Unknown notification type: " + type);
        };
    }

}
