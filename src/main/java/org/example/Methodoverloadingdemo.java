package org.example;

public class Methodoverloadingdemo {

    // Overloaded method with two integer parameters
    public int add(int a, int b) {//a=10 b=20->a+b=30
        return a + b;
    }
    public float add(float a,int b){
        return a+b;
    }

    // Overloaded method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Methodoverloadingdemo obj = new Methodoverloadingdemo();
      int result=obj.add(4,5,6);//reusable
        System.out.println("Addtion of 3 ints: "+obj.add(4,5,6));//not reusable
        result=result+10;
        // Calling the overloaded methods
        System.out.println("Addition of two integers: " + obj.add(10, 20));
        System.out.println("Addition of three integers: " + obj.add(10, 20, 30));
        System.out.println("Addition of two doubles: " + obj.add(10.5, 20.5));
        System.out.println("Addition of one float and one integer : " + obj.add(10.5f, 20));
    }
}
