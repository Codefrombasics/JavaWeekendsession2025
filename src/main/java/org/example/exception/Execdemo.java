package org.example.exception;

public class Execdemo {
    public static void main(String[] args) {
        try{
        System.out.println(1/1);
        }catch (Exception e){
            System.out.println("error message"+e.getMessage());
        }finally {
            System.out.println("Executed for Sure");
        }
        System.out.println("End of the Program");
    }
}
