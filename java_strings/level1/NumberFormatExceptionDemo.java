package java_strings.level1;

import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void generateNumberFormatException(String text) {
        // Attempting to parse a non-numeric string as an integer
        int number = Integer.parseInt(text); // This will throw NumberFormatException if text is not a valid number
        System.out.println("Parsed number: " + number);
    }

    public static void handleNumberFormatException(String text) {
        try {
            generateNumberFormatException(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (Exception e) {
            System.out.println("Caught a generic exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number (or a non-numeric string): ");
        String userInput = sc.nextLine();

        // Call method to generate the exception
        generateNumberFormatException(userInput);

        // Call method to handle the exception
        handleNumberFormatException(userInput);
    }
}
