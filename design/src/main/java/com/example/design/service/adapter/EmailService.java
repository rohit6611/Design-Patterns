package com.example.design.service.adapter;

public class EmailService implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

