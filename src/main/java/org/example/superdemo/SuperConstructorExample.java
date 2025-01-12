package org.example.superdemo;
class Vehicle2 {
    Vehicle2(String type) {
        System.out.println("Vehicle type: " + type);
    }
}

class Car2 extends Vehicle2 {
    Car2(String type) {
        super(type); // Calls the constructor of the Vehicle class
        System.out.println("Car type: " + type);
    }
}

public class SuperConstructorExample {
    public static void main(String[] args) {
        Car2 myCar = new Car2("Sedan");
        // Output:
        // Vehicle type: Sedan
        // Car type: Sedan
    }
}