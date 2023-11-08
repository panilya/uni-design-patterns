package com.example.proxyjava;

public class ProxyJavaApplication {

    public static void main(String[] args) {
        HotelBooking hotelBooking = new HotelBookingProxy("Available Hotel");
        hotelBooking.bookHotel("Available Hotel");

        HotelBooking hotelBooking2 = new HotelBookingProxy("Not Available Hotel");
        hotelBooking2.bookHotel("Not Available Hotel");
    }
}
