package com.example.factorymethodjava;

public class BudgetHotel implements Hotel {
    @Override
    public void bookRoom() {
        System.out.println("Budget room booked.");
    }
}
