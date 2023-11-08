package com.example.adapterjava;

public class AdapterJavaApplication {

    public static void main(String[] args) {
        OldHotelBookingSystem oldHotelBookingSystem = new OldHotelBookingSystem();
        NewHotelBookingSystem newHotelBookingSystem = new HotelBookingAdapter(oldHotelBookingSystem);

        newHotelBookingSystem.book("2023-06-01", "Hotel California");
    }
    
}
