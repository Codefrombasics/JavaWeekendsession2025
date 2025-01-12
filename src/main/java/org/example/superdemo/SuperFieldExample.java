package org.example.superdemo;


class Vehicle3 {
    String color = "Red";
}

class Car3 extends Vehicle3 {
    String color = "Blue";

    void printColor() {
        System.out.println("Car's color: " + color); // Output: Blue
        System.out.println("Vehicle's color: " + super.color); // Output: Red
    }
}

public class SuperFieldExample {
    public static void main(String[] args) {
        Car3 myCar = new Car3();
        myCar.printColor();
    }
}