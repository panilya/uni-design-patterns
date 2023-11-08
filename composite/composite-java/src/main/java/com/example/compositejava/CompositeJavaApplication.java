package com.example.compositejava;

public class CompositeJavaApplication {

    public static void main(String[] args) {
        SingleRoom singleRoom1 = new SingleRoom("Room 1");
        SingleRoom singleRoom2 = new SingleRoom("Room 2");
        DoubleRoom doubleRoom1 = new DoubleRoom("Room 3");
        DoubleRoom doubleRoom2 = new DoubleRoom("Room 4");

        HotelComposite hotel = new HotelComposite("Hotel 1");
        hotel.addComponent(singleRoom1);
        hotel.addComponent(singleRoom2);
        hotel.addComponent(doubleRoom1);
        hotel.addComponent(doubleRoom2);

        hotel.showDetails();
    }
}
