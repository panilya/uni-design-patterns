package com.example.facadejava;

public class CarRentalService implements CarRental {
    @Override
    public void rentCar() {
        System.out.println("Car rented successfully.");
    }
}
