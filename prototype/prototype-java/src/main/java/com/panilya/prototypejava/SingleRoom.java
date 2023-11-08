package com.panilya.prototypejava;

public class SingleRoom implements RoomPrototype {
    @Override
    public RoomPrototype copy() {
        return new SingleRoom();
    }
}
