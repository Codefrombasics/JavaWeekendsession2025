package org.example.collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("Harry Potter");
        books.push("The Hobbit");
        books.push("1984");

        while (!books.isEmpty()) {
            System.out.println("Reading: " + books.pop());
        }
    }
}

