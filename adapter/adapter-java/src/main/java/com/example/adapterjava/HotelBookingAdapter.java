package com.example.adapterjava;

public class HotelBookingAdapter implements NewHotelBookingSystem {
    private final OldHotelBookingSystem oldHotelBookingSystem;

    public HotelBookingAdapter(OldHotelBookingSystem oldHotelBookingSystem) {
        this.oldHotelBookingSystem = oldHotelBookingSystem;
    }

    @Override
    public void book(String date, String hotelName) {
        oldHotelBookingSystem.bookOld(date, hotelName);
    }
}
