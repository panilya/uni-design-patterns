package com.example.objectpooljava;

import java.util.concurrent.ConcurrentLinkedQueue;

public class RoomPool {
    private ConcurrentLinkedQueue<HotelRoom> pool;

    public RoomPool() {
        pool = new ConcurrentLinkedQueue<>();

        for (int i = 0; i < 5; i++) {
            pool.add(new HotelRoom());
        }
    }

    public HotelRoom getRoomFromPool() {
        HotelRoom room;

        if ((room = pool.poll()) == null) {
            room = new HotelRoom();
        }

        return room;
    }

    public void returnRoomToPool(HotelRoom room) {
        pool.add(room);
    }

}
