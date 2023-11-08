package com.example.decoratorjava;

public class SuiteRoom extends RoomDecorator {
    public SuiteRoom(HotelBooking hotelBooking) {
        super(hotelBooking);
    }

    @Override
    public double getCost() {
        return super.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Suite room";
    }
}
