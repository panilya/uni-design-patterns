package com.panilya.singleton;

import java.util.ArrayList;
import java.util.List;

public class HotelBookingSystem {
    private static HotelBookingSystem instance;

    private final List<Booking> bookings;

    private HotelBookingSystem() {
        bookings = new ArrayList<>();
    }

    public static synchronized HotelBookingSystem getInstance() {
        if (instance == null) {
            instance = new HotelBookingSystem();
        }
        return instance;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
