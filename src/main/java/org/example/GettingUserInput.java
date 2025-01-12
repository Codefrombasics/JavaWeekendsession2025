package org.example;

import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter some string");
        String number=scanner.nextLine();
        System.out.println("Number you entered "+number);
    }
}
