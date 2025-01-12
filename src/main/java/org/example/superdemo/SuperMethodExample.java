package org.example.superdemo;

class Vehicle {
    void start() {
        System.out.println("The vehicle starts.");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("The car starts.");
    }

    void callSuperStart() {
        super.start(); // Calls the start method from the Vehicle class
    }
}

public class SuperMethodExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();         // Output: The car starts.
        myCar.callSuperStart(); // Output: The vehicle starts.
    }
}

