package org.example.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.remove(1); // Removes "Banana"
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
