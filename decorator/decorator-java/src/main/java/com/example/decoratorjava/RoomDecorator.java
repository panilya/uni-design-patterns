package com.example.decoratorjava;

public abstract class RoomDecorator implements HotelBooking {
    protected HotelBooking hotelBooking;

    public RoomDecorator(HotelBooking hotelBooking) {
        this.hotelBooking = hotelBooking;
    }

    public double getCost() {
        return this.hotelBooking.getCost();
    }

    public String getDescription() {
        return this.hotelBooking.getDescription();
    }
}
