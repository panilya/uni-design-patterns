package com.example.builderjava;

public class HotelBooking {

    String hotelName;
    private String roomType;
    private String mealPlan;
    private boolean isWifiEnabled;
    private boolean isAirportShuttleIncluded;

    public HotelBooking(BookingBuilder bookingBuilder) {
        this.hotelName = bookingBuilder.hotelName;
        this.roomType = bookingBuilder.roomType;
        this.mealPlan = bookingBuilder.mealPlan;
        this.isWifiEnabled = bookingBuilder.isWifiEnabled;
        this.isAirportShuttleIncluded = bookingBuilder.isAirportShuttleIncluded;
    }

    public static class BookingBuilder {
        private String hotelName;
        private String roomType;
        private String mealPlan;
        private boolean isWifiEnabled;
        private boolean isAirportShuttleIncluded;

        public BookingBuilder(String hotelName, String roomType) {
            this.hotelName = hotelName;
            this.roomType = roomType;
        }

        public BookingBuilder setMealPlan(String mealPlan) {
            this.mealPlan = mealPlan;
            return this;
        }

        public BookingBuilder setWifiEnabled(boolean isWifiEnabled) {
            this.isWifiEnabled = isWifiEnabled;
            return this;
        }

        public BookingBuilder setAirportShuttleIncluded(boolean isAirportShuttleIncluded) {
            this.isAirportShuttleIncluded = isAirportShuttleIncluded;
            return this;
        }

        public HotelBooking build() {
            return new HotelBooking(this);
        }
    }
}
