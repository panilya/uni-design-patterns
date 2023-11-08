package com.example.bridgejava;

public class BridgeJavaApplication {

    public static void main(String[] args) {
        HotelBooking luxuryHotelBooking = new LuxuryHotelBooking(new PayPal());
        luxuryHotelBooking.book("Luxury Palace", 500.0);

        HotelBooking budgetHotelBooking = new BudgetHotelBooking(new CreditCard());
        budgetHotelBooking.book("Budget Inn", 100.0);
    }

}
