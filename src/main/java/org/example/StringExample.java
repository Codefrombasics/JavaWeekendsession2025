package org.example;

public class StringExample {

    public static void main(String[] args) {
        // Creating Strings
        String str1 = "Hello, World!";//string literal(String Pool)
        String str2 = new String("Java Programming");//String object

        // String Length
        int length = str1.length();
        System.out.println("Length of str1: " + length);

        // String Concatenation
        String str3 = str1 +" "+ str2;
        System.out.println("Concatenated String: " + str3);

        // Character at Index
        char charAt = str1.charAt(7);
        System.out.println("Character at index 7 in str1: " + charAt);

        // Substring
        String substr = str2.substring(5, 16);//from 5th index to 16-1th index
        System.out.println("Substring of str2: " + substr);

        // String Comparison
        boolean equals = str1.equals("Hello, World!");
        System.out.println("str1 equals 'Hello, World!': " + equals);

        // String Replace
        String replacedStr = str2.replace("Java", "Python");
        System.out.println("Replaced String: " + replacedStr);

        // String to Upper Case
        String upperStr = str1.toUpperCase();
        System.out.println("Upper Case: " + upperStr);

        // String to Lower Case
        String lowerStr = str1.toLowerCase();
        System.out.println("Lower Case: " + lowerStr);

        // Trim String
        String str4 = "   Trimmed String   ";
        String trimmedStr = str4.trim();
        System.out.println("Trimmed String: '" + trimmedStr + "'");
    }
}
