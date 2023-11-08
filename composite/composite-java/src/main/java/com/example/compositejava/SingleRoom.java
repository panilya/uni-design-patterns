package com.example.compositejava;

public class SingleRoom implements HotelComponent {
    private String name;

    public SingleRoom(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Single Room: " + name);
    }
}
