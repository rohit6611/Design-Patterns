package com.example.design.service.strategy;

public class UpiPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}
