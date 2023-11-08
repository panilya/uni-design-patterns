package com.example.decoratorjava;

public class DecoratorJavaApplication {

    public static void main(String[] args) {
        HotelBooking basicHotel = new BasicHotel();
        System.out.println(basicHotel.getCost());
        System.out.println(basicHotel.getDescription());

        HotelBooking deluxeHotel = new DeluxeRoom(new BasicHotel());
        System.out.println(deluxeHotel.getCost());
        System.out.println(deluxeHotel.getDescription());

        HotelBooking suiteHotel = new SuiteRoom(new BasicHotel());
        System.out.println(suiteHotel.getCost());
        System.out.println(suiteHotel.getDescription());
    }

}
