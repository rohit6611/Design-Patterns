package com.example.design.service.impl;

import com.example.design.service.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class PushNotificationService implements NotificationService {
    @Override
    public void sendNotification(String name) {
        System.out.println("Push Notification service");
    }
}
