package com.example.factorymethodjava;

public class LuxuryHotel implements Hotel {
    @Override
    public void bookRoom() {
        System.out.println("Luxury room booked.");
    }
}
