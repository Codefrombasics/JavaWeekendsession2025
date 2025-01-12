package org.example.exception;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
            int arr[]={10,20};
            System.out.println("10th element"+arr[10]);//array index out of Bound Exception
        } catch (ArithmeticException e) {
            // Handling the specific exception
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handling any other exceptions
            System.out.println("Error: An unexpected error occurred."+e.getMessage());
        } finally {
            // Code that always executes
            System.out.println("Finally block executed.");
        }
    }

    // Method that throws an exception
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}

