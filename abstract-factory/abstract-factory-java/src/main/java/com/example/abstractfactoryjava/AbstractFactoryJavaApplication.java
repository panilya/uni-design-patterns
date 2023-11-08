package com.example.abstractfactoryjava;

public class AbstractFactoryJavaApplication {

    public static void main(String[] args) {
        Booking hotelBooking = BookingProvider.getBooking(new HotelBookingFactory());
        hotelBooking.book();

        Booking flightBooking = BookingProvider.getBooking(new FlightBookingFactory());
        flightBooking.book();
    }

}
