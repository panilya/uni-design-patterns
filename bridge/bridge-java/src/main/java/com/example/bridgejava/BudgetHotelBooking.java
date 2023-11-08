package com.example.bridgejava;

public class BudgetHotelBooking extends HotelBooking {
    public BudgetHotelBooking(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    void book(String hotelName, double amount) {
        System.out.println("Booking a budget hotel: " + hotelName);
        paymentSystem.processPayment(hotelName, amount);
    }
}
