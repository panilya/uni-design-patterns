package com.example.objectpooljava;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class HotelBookingSystem {
    public static void main(String[] args) {
        RoomPool roomPool = new RoomPool();
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);

        service.scheduleAtFixedRate(() -> {
            HotelRoom room = roomPool.getRoomFromPool();
            System.out.println("Room " + room.getRoomId() + " is booked");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Room " + room.getRoomId() + " is released");
            roomPool.returnRoomToPool(room);
        }, 0, 1, TimeUnit.SECONDS);

        service.scheduleAtFixedRate(() -> {
            HotelRoom room = roomPool.getRoomFromPool();
            System.out.println("Room " + room.getRoomId() + " is booked");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Room " + room.getRoomId() + " is released");
            roomPool.returnRoomToPool(room);
        }, 0, 1, TimeUnit.SECONDS);
    }
}
