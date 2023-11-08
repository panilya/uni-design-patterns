package com.example.facadejava;

public class AirlineFlightBooking implements FlightBooking {
    @Override
    public void bookFlight() {
        System.out.println("Flight ticket booked successfully.");
    }
}
