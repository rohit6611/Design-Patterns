package com.example.design.service.adapter;

public class SmsAdapter implements NotificationSender {

    private LegacySmsService legacySmsService;

    public SmsAdapter(LegacySmsService legacySmsService) {
        this.legacySmsService = legacySmsService;
    }

    @Override
    public void send(String message) {
        legacySmsService.sendSms(message); // Adapting call
    }
}

