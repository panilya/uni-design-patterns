package com.example.proxyjava;

public class RealHotelBooking implements HotelBooking {
    private String hotelName;

    @Override
    public void bookHotel(String hotelName) {
        this.hotelName = hotelName;
        System.out.println("Hotel " + hotelName + " has been successfully booked.");
    }
}
