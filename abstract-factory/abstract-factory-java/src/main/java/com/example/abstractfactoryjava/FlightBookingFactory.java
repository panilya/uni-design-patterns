package com.example.abstractfactoryjava;

public class FlightBookingFactory implements BookingFactory {
    @Override
    public Booking createBooking() {
        return new FlightBooking();
    }
}
