package com.example.abstractfactoryjava;

public class BookingProvider {
    public static Booking getBooking(BookingFactory factory){
        return factory.createBooking();
    }
}
