package com.example.objectpooljava;

public class HotelRoom {
    private static int counter = 0;
    private int roomId;

    public HotelRoom() {
        roomId = counter++;
    }

    public int getRoomId() {
        return roomId;
    }
}
