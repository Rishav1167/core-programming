package java_strings.level1;

import java.util.Scanner;

public class LowercaseComparison {

    public static String convertToLowerCaseUsingCharAt(String text) {
        StringBuilder lowerText = new StringBuilder();

        // Convert each character to lowercase using ASCII values
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                lowerText.append((char) (currentChar + 32)); // Convert to lowercase
            } else {
                lowerText.append(currentChar); // Leave as is if not uppercase
            }
        }
        return lowerText.toString();
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
        String lowerCaseText = convertToLowerCaseUsingCharAt(userInput);

        // Convert using built-in method
        String builtInLowerCaseText = userInput.toLowerCase();

        // Compare the two results
        boolean isEqual = compareStrings(lowerCaseText, builtInLowerCaseText);
        System.out.println("Converted to Lowercase using custom method: " + lowerCaseText);
        System.out.println("Converted to Lowercase using built-in method: " + builtInLowerCaseText);
        System.out.println("Are both strings equal? " + isEqual);
    }
}
