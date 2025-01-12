package org.example.exception;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class InvalidMarksException extends Exception{
    public InvalidMarksException(String msg){
        super(msg);
    }
}

public class CustomExceptionExample {

    public static void main(String[] args) {
        try {
            validateAge(19);
            validataMarks(-10);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }catch (InvalidMarksException e){
            System.out.println("Custom Exception "+e.getMessage());
        }finally
        {
            System.out.println("Must be executed");
        }
    }

    private static void validataMarks(int i) throws InvalidMarksException {
        if(i<0 || i>100)
            throw new InvalidMarksException("Mark should be between 0 to 1");
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18.");
        }
    }
}

