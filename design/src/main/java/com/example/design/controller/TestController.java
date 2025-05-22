package com.example.design.controller;

import com.example.design.service.NotificationService;
import com.example.design.service.impl.NotificationFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    private final NotificationFactory notificationFactory;

    public TestController(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    @GetMapping
    public void sendNotification(@RequestParam String type){
        NotificationService notificationType = notificationFactory.getNotificationType(type);
        notificationType.sendNotification(type);
    }

}
