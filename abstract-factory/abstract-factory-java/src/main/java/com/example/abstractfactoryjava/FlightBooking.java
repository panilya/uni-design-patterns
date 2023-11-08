package com.example.abstractfactoryjava;

public class FlightBooking implements Booking {
    @Override
    public void book() {
        System.out.println("Flight Booked Successfully");
    }
}
