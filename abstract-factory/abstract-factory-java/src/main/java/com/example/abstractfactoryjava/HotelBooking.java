package com.example.abstractfactoryjava;

public class HotelBooking implements Booking {
    @Override
    public void book() {
        System.out.println("Hotel Booked Successfully");
    }
}
