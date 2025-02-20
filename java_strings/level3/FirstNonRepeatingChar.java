package java_strings.level3;

import java.util.Scanner;

public class FirstNonRepeatingChar {

    // Method to find the first non-repeating character in a string
    public static char firstNonRepeatingCharacter(String str) {
        int[] frequency = new int[256];

        // Loop through the string and count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            frequency[currentChar]++;
        }

        // Loop through the string again to find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Find the first non-repeating character
        char result = firstNonRepeatingCharacter(inputString);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}