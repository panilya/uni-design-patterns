package com.example.bridgejava;

public class PayPal implements PaymentSystem {
    @Override
    public void processPayment(String hotelName, double amount) {
        System.out.println("Processing payment of $" + amount + " for " + hotelName + " through PayPal.");
    }
}
