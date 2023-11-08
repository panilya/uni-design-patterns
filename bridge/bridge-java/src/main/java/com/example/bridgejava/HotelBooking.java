package com.example.bridgejava;

public abstract class HotelBooking {
    protected PaymentSystem paymentSystem;

    public HotelBooking(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    abstract void book(String hotelName, double amount);
}
