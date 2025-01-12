package org.example;

import java.util.Scanner;

public class Ifelseifdemo {
    public static void main(String[] args) {
        //getting input from user
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int num1=scanner.nextInt();
        System.out.println("you have entered "+num1);

        //check the entered number is +ve, -ve or Zero
        if(num1>0)
            System.out.println(num1+" is positive");
        else if(num1<0)
            System.out.println(num1+" is negative");
        else
            System.out.println(num1);


    }
}
