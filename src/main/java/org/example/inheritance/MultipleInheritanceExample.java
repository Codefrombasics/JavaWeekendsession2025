package org.example.inheritance;

// Interface
interface Animal3 {
    void eat();
}

// Interface
interface Pet {
    void play();
}

// Class implementing multiple interfaces
class Dog3 implements Animal3, Pet {
    public void eat() {
        System.out.println("The dog eats.");
    }

    public void play() {
        System.out.println("The dog plays.");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Dog3 myDog = new Dog3();
        myDog.eat();  // Method from Animal interface
        myDog.play(); // Method from Pet interface
    }
}

