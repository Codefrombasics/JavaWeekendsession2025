package org.example;

public class MyApplication {
    public static void main(String[] args) {
        int age=16;
        int eligibility=18;
        if(age>=eligibility) {//executes for true condition
            System.out.println("Eligible to vote");
        }else{//executes for false condition
            System.out.println("try after "+(eligibility-age)+" year/years");
        }



        System.out.println("one");
        System.out.println("two");
        System.out.println("three");

    }
}
