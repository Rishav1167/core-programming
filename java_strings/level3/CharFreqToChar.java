package java_strings.level3;

import java.util.Scanner;

public class CharFreqToChar {

    // Method to find the frequency of characters using nested loops
    public static String[] findCharacterFrequency(String str) {
        // Convert the string to a character array
        char[] chars = str.toCharArray();
        int length = chars.length;

        // Array to store the frequency of each character
        int[] frequency = new int[length];

        // Array to store the result as a string (character and frequency)
        String[] result = new String[length];

        // Outer loop to iterate through each character
        for (int i = 0; i < length; i++) {
            // Skip the character if it's already counted
            if (chars[i] == '0') {
                continue;
            }

            // Initialize frequency to 1
            frequency[i] = 1;

            // Inner loop to check for duplicates
            for (int j = i + 1; j < length; j++) {
                // If the characters are the same, increment the frequency
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    // Mark the character as counted by setting it to '0'
                    chars[j] = '0';
                }
            }

            // Store the character and its frequency in the result array
            result[i] = chars[i] + ": " + frequency[i];
        }

        return result;
    }

    // Method to display the character frequencies
    public static void displayCharacterFrequency(String[] result) {
        System.out.println("Character Frequency:");
        System.out.println("---------------------");
        for (String s : result) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Find the character frequencies
        String[] result = findCharacterFrequency(inputString);
        displayCharacterFrequency(result);
    }
}