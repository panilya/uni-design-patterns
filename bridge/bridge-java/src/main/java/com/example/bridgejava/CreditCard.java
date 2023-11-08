package com.example.bridgejava;

public class CreditCard implements PaymentSystem {
    @Override
    public void processPayment(String hotelName, double amount) {
        System.out.println("Processing payment of $" + amount + " for " + hotelName + " through Credit Card.");
    }
}
