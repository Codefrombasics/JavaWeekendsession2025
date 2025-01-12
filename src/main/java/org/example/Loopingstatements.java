package org.example;

import java.util.Scanner;

public class Loopingstatements {
    public static void main(String[] args) {
        int marks[]={67,78,89,87,56};
                   //0 ,1, 2, 3, 4
        //to access all elements
        for (int mark:marks){//moves only in forward direction, not in backward direction
            System.out.print(mark+" ");//67 78 89 87  56
        }
       //printing in forward direction
//        for (int i = 0; i < marks.length; i++) {//marks.length is 5(no of elements)
//            //accessing the array elements using its index
//            System.out.println(marks[i]);//marks[0] 67 marks[1] 78
//        }
        //printing in reverse direction
//        n+1 time execution
//        for (int i = marks.length-1; i >=0 ; i--) {
//            System.out.println(marks[i]);
//
//        }

//        int i=0;
//        while(i< marks.length){
//            System.out.println(marks[i]);
//            i++;
//        }
//        10->10+0->10
//        0+1+2+3
        //while loop
//        Scanner scanner=new Scanner(System.in);
//        int total=0;

//        used when you don't know the number of iteration
//        while(true){
//
//            System.out.println("Enter number");
//            int num1=scanner.nextInt();//collect the integer input
//            System.out.println("you have entered "+num1);
//            total+=num1;
//            String userChoice;
//            System.out.println("would you like to enter some more number?");
//            userChoice=scanner.next();//collect the string input
//            if(userChoice.equals("No")||userChoice.equals("no"))
//                break;//help to come out of the loop
//        }
//        System.out.println(total);

        for (int j = 0; j < 5; j++) {
            if(j%2!=0)
                continue;//takes you to next iteration
            System.out.println(marks[j]);

        }

    }
}
