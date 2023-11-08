package com.example.compositejava;

import java.util.ArrayList;
import java.util.List;

public class HotelComposite implements HotelComponent {
    private List<HotelComponent> hotelComponents = new ArrayList<>();
    private String name;

    public HotelComposite(String name) {
        this.name = name;
    }

    public void addComponent(HotelComponent component) {
        hotelComponents.add(component);
    }

    public void removeComponent(HotelComponent component) {
        hotelComponents.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Hotel: " + name);
        for (HotelComponent component : hotelComponents) {
            component.showDetails();
        }
    }
}
