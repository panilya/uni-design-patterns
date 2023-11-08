package com.example.compositejava;

public class DoubleRoom implements HotelComponent {
    private String name;

    public DoubleRoom(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Double Room: " + name);
    }
}
