package com.example.factorymethodjava;

public class FactoryMethodJavaApplication {

    public static void main(String[] args) {
        HotelFactory luxuryHotelFactory = new LuxuryHotelFactory();
        luxuryHotelFactory.bookHotel();

        HotelFactory budgetHotelFactory = new BudgetHotelFactory();
        budgetHotelFactory.bookHotel();
    }

}
