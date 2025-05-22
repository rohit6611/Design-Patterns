package com.example.design.service.impl;

import com.example.design.service.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String name) {
        System.out.println("Email Notification Service");
    }
}
