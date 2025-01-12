package org.example;

public class Methoddemo {
    public static void main(String[] args) {

        Arithemetic arithemetic=new Arithemetic();
        //Storing the answer in the new variable result and then reusing
        int result=arithemetic.answerOfMultiplication();
        System.out.println(result);
        if(result>=200)//resuing the result
            System.out.println("Anwer is above 200");


    }
}
