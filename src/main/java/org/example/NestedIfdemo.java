package org.example;

import java.util.Scanner;

public class NestedIfdemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age");
        int age=scanner.nextInt();
        System.out.println("your age is "+age);

        if(age<0)
            System.out.println(age+" should not be negative");
        else{
            int eligibility=18;
            if(age>=eligibility) {//executes for true condition
                System.out.println("Eligible to vote");
            }else{//executes for false condition
                System.out.println("try after "+(eligibility-age)+" year/years");
            }
        }
    }
}
