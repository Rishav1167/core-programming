package java_strings.level1;

import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter the start index: ");
        int start = sc.nextInt();

        System.out.print("Enter the end index: ");
        int end = sc.nextInt();

        // Generating IllegalArgumentException
        try {
            generateException(text, start, end);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e);
        }

        // Handling IllegalArgumentException
        handleException(text, start, end);

    }

    // Method to generate IllegalArgumentException
    public static void generateException(String text, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start index cannot be greater than end index.");
        }
        System.out.println("Substring: " + text.substring(start, end));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text, int start, int end) {
        try {
            if (start > end) {
                throw new IllegalArgumentException("Start index cannot be greater than end index.");
            }
            System.out.println("Substring: " + text.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled: " + e);
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled: " + e);
        }
    }
}