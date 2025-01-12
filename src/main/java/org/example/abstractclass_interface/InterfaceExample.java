package org.example.abstractclass_interface;

interface Drivable {
    void start(); // Abstract method

    default void stop() {
        System.out.println("The vehicle stops."); // Default method
    }

    static void honk() {
        System.out.println("Honking the horn!"); // Static method
    }
}
//class extends anotherclass
//interface extends interface
//class implements interface

class Bike implements Drivable {

    @Override
    public void start() {
        System.out.println("The bike starts.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.start();  // The bike starts.
        myBike.stop();   // The vehicle stops.
        Drivable.honk(); // Honking the horn!
    }
}
