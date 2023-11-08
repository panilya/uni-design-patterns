package com.example.abstractfactoryjava;

public class HotelBookingFactory implements BookingFactory {
    @Override
    public Booking createBooking() {
        return new HotelBooking();
    }
}
