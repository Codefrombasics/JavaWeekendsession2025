package org.example.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> fruits = new TreeSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate entry ignored
        fruits.add("Mango");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

