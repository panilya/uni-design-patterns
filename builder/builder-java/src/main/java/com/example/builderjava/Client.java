package com.example.builderjava;

public class Client {

    public static void main(String[] args) {
        HotelBooking hotelBooking = new HotelBooking.BookingBuilder("The Grand Hotel", "Deluxe Room")
                .setMealPlan("Breakfast included")
                .setWifiEnabled(true)
                .setAirportShuttleIncluded(false)
                .build();

        System.out.println("Hotel Booking completed for " + hotelBooking.hotelName);
    }
}
