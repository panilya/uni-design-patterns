package com.example.flyweightjava;

public class DeluxeRoom implements HotelRoom {
    private String roomNumber;

    public DeluxeRoom(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void book(String customerName) {
        System.out.println("Booking Deluxe Room " + this.roomNumber + " for " + customerName);
    }
}
