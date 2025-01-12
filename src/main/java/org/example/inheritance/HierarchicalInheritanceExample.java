package org.example.inheritance;

// Superclass
class Animal2 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
class Dog2 extends Animal2 {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Another Subclass
class Cat extends Animal2 {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Dog2 myDog = new Dog2();
        Cat myCat = new Cat();

        myDog.eat();  // Inherited method from Animal class
        myDog.bark(); // Method from Dog class

        myCat.eat();  // Inherited method from Animal class
        myCat.meow(); // Method from Cat class
    }
}

