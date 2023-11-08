package com.example.facadejava;

public class TravelFacade {
    private final RoomBooking roomBooking;
    private final FlightBooking flightBooking;
    private final CarRental carRental;

    public TravelFacade() {
        this.roomBooking = new HotelRoomBooking();
        this.flightBooking = new AirlineFlightBooking();
        this.carRental = new CarRentalService();
    }

    public void arrangeTrip() {
        roomBooking.bookRoom();
        flightBooking.bookFlight();
        carRental.rentCar();
    }
}
