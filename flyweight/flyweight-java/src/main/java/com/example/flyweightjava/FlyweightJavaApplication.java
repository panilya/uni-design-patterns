package com.example.flyweightjava;

public class FlyweightJavaApplication {

    public static void main(String[] args) {
        HotelRoomFactory hotelRoomFactory = new HotelRoomFactory();

        HotelRoom standardRoom1 = hotelRoomFactory.getHotelRoom("Standard", "101");
        standardRoom1.book("John Doe");

        HotelRoom deluxeRoom1 = hotelRoomFactory.getHotelRoom("Deluxe", "201");
        deluxeRoom1.book("Jane Doe");

        HotelRoom standardRoom2 = hotelRoomFactory.getHotelRoom("Standard", "101");
        standardRoom2.book("Alex Smith");

        HotelRoom deluxeRoom2 = hotelRoomFactory.getHotelRoom("Deluxe", "201");
        deluxeRoom2.book("Emma Smith");
    }
}
