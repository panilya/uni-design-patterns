package com.example.flyweightjava;

import java.util.HashMap;
import java.util.Map;

public class HotelRoomFactory {
    private Map<String, HotelRoom> hotelRooms = new HashMap<>();

    public HotelRoom getHotelRoom(String roomType, String roomNumber) {
        String key = roomType + "-" + roomNumber;
        if (!hotelRooms.containsKey(key)) {
            if ("Standard".equalsIgnoreCase(roomType)) {
                hotelRooms.put(key, new StandardRoom(roomNumber));
            } else if ("Deluxe".equalsIgnoreCase(roomType)) {
                hotelRooms.put(key, new DeluxeRoom(roomNumber));
            }
        }
        return hotelRooms.get(key);
    }
}
