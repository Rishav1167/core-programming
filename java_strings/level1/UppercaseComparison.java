package java_strings.level1;

import java.util.Scanner;

public class UppercaseComparison {

    public static String convertToUpperCaseUsingCharAt(String text) {
        StringBuilder upperText = new StringBuilder();

        // Convert each character to uppercase using ASCII values
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                upperText.append((char) (currentChar - 32)); // Convert to uppercase
            } else {
                upperText.append(currentChar); // Leave as is if not lowercase
            }
        }
        return upperText.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the text
        System.out.print("Enter a text: ");
        String userInput = sc.nextLine();

        // Convert using user-defined method
        String upperCaseText = convertToUpperCaseUsingCharAt(userInput);

        // Convert using built-in method
        String builtInUpperCaseText = userInput.toUpperCase();

        // Compare the two results
        boolean isEqual = compareStrings(upperCaseText, builtInUpperCaseText);
        System.out.println("Converted to Uppercase using custom method: " + upperCaseText);
        System.out.println("Converted to Uppercase using built-in method: " + builtInUpperCaseText);
        System.out.println("Are both strings equal? " + isEqual);
    }
}
