package com.panilya.prototypejava;

public class PrototypeJavaApplication {

    public static void main(String[] args) {
        RoomPrototype singleRoom = RoomFactory.getPrototype("single");
        RoomPrototype doubleRoom = RoomFactory.getPrototype("double");
        RoomPrototype suiteRoom = RoomFactory.getPrototype("suite");

        if (singleRoom != null) {
            System.out.println("Single room booked");
        }

        if (doubleRoom != null) {
            System.out.println("Double room booked");
        }

        if (suiteRoom != null) {
            System.out.println("Suite room booked");
        }
    }

}
