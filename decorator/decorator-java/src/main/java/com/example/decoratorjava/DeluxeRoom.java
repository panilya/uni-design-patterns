package com.example.decoratorjava;

public class DeluxeRoom extends RoomDecorator {
    public DeluxeRoom(HotelBooking hotelBooking) {
        super(hotelBooking);
    }

    @Override
    public double getCost() {
        return super.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Deluxe room";
    }
}
