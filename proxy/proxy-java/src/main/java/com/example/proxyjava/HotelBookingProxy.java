package com.example.proxyjava;

public class HotelBookingProxy implements HotelBooking {
    private String hotelName;
    private RealHotelBooking realHotelBooking;

    public HotelBookingProxy(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public void bookHotel(String hotelName) {
        if (realHotelBooking == null) {
            realHotelBooking = new RealHotelBooking();
        }
        if (checkAvailability()) {
            realHotelBooking.bookHotel(hotelName);
        } else {
            System.out.println("Sorry, the hotel " + hotelName + " is fully booked.");
        }
    }

    private boolean checkAvailability() {
        // Here, you can connect to the database and check the hotel availability.
        // We'll assume that the hotel is available if its name contains the word "available"
        return hotelName.toLowerCase().contains("available");
    }
}
