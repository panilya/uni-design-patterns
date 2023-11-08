package com.panilya.prototypejava;

public class DoubleRoom implements RoomPrototype {
    @Override
    public RoomPrototype copy() {
        return new DoubleRoom();
    }
}
