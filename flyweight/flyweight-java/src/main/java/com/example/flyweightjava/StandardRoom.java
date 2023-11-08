package com.example.flyweightjava;

public class StandardRoom implements HotelRoom {
    private String roomNumber;

    public StandardRoom(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void book(String customerName) {
        System.out.println("Booking Standard Room " + this.roomNumber + " for " + customerName);
    }
}
