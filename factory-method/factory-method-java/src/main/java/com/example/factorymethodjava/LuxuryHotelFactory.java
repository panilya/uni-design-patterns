package com.example.factorymethodjava;

public class LuxuryHotelFactory extends HotelFactory {
    @Override
    Hotel createHotel() {
        return new LuxuryHotel();
    }
}
