package com.example.factorymethodjava;

public class BudgetHotelFactory extends HotelFactory {
    @Override
    Hotel createHotel() {
        return new BudgetHotel();
    }
}
