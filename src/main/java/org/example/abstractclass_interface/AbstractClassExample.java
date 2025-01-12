package org.example.abstractclass_interface;

abstract class Vehicle {
    String color;//red

    //Constructor
    Vehicle(String color) {
        this.color = color;
    }

    abstract void start(); // Abstract method

    void displayColor() { // Concrete method
        System.out.println("The vehicle color is: " + color);
    }
}

class Car extends Vehicle {

    Car(String color) {
        super(color);
    }

    @Override
    void start() {
        System.out.println("The car starts.");
    }
}
class Bike2 extends Vehicle{
    Bike2(String color){
        super(color);
    }

    @Override
    void start() {
        System.out.println("The bike starts.");
    }

}

public class AbstractClassExample {
    public static void main(String[] args) {
        Car myCar = new Car("Red");
        myCar.start();          // Output: The car starts.
        myCar.displayColor();   // Output: The vehicle color is: Red
        Bike2 bike=new Bike2("Blue");
        bike.start();
        bike.displayColor();
    }
}
