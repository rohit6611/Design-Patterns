package com.example.design.service.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.setPaymentStrategy(new CreditCardPayment());
        paymentService.checkout(500.0);

        paymentService.setPaymentStrategy(new UpiPayment());
        paymentService.checkout(300.0);
    }
}

//Factory = "Give me an object based on a condition."
//
//Strategy = "I’ll use this behavior/algorithm now; maybe another one later."