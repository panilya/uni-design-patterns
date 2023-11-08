package com.panilya.prototypejava;

public class SuiteRoom implements RoomPrototype {
    @Override
    public RoomPrototype copy() {
        return new SuiteRoom();
    }
}
