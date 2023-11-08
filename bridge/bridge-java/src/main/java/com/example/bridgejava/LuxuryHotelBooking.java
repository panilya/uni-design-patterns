package com.example.bridgejava;

public class LuxuryHotelBooking extends HotelBooking {
    public LuxuryHotelBooking(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    void book(String hotelName, double amount) {
        System.out.println("Booking a luxury hotel: " + hotelName);
        paymentSystem.processPayment(hotelName, amount);
    }
}
