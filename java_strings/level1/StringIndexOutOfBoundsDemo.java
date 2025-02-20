package java_strings.level1;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Generating StringIndexOutOfBoundsException
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e);
        }

        // Handling StringIndexOutOfBoundsException
        handleException(text);
    }

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        System.out.println("Character at index 100: " + text.charAt(100)); // This will cause an exception
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            System.out.println("Character at index 100: " + text.charAt(100)); // This may cause an exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled: " + e);
        }
    }
}