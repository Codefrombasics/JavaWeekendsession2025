package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Allows duplicates
        fruits.remove("Apple");
        System.out.println("2nd index Fruit"+fruits.get(2));

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
