package com.example.design.service.adapter;

//When you want to use an existing class but its interface does not match your needs.
//
//You need to integrate with third-party libraries or legacy code.
//Suppose you have a legacy SMS service and a new email service, and you want to use both with a common interface:
public class NotificationClient {
    public static void main(String[] args) {
        NotificationSender emailSender = new EmailService();
        emailSender.send("Welcome via Email!");

        NotificationSender smsSender = new SmsAdapter(new LegacySmsService());
        smsSender.send("Welcome via SMS!");
    }
}

