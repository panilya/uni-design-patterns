package com.example.decoratorjava;

public class BasicHotel implements HotelBooking {
    @Override
    public double getCost() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Basic hotel room";
    }
}
