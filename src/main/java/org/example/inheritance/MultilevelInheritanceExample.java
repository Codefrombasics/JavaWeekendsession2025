package org.example.inheritance;

// Superclass
class Animal1 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
class Dog1 extends Animal1 {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Subclass of Dog
class Puppy1 extends Dog1{
    void weep() {
        System.out.println("The puppy weeps.");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Puppy1 myPuppy = new Puppy1();
        myPuppy.eat();  // Inherited from Animal class
        myPuppy.bark(); // Inherited from Dog class
        myPuppy.weep(); // Method from Puppy class
    }
}
