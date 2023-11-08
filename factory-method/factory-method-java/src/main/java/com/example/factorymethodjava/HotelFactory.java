package com.example.factorymethodjava;

public abstract class HotelFactory {
    abstract Hotel createHotel();

    public void bookHotel() {
        Hotel hotel = createHotel();
        hotel.bookRoom();
    }
}
