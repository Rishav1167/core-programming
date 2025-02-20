package java_strings.level3;

import java.util.Scanner;

public class CharFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String str) {
        int[] frequency = new int[256];

        // Loop through the string to count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            frequency[currentChar]++;
        }

        // Count how many unique characters are present in the string
        int uniqueCharCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCharCount++;
            }
        }

        // Create a 2D array to store the characters and their frequencies
        String[][] result = new String[uniqueCharCount][2];
        int index = 0;

        // Loop through the frequency array and store characters with non-zero frequency in the result array
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Store character as string
                result[index][1] = String.valueOf(frequency[i]); // Store frequency as string
                index++;
            }
        }

        return result;
    }

    // Method to display the result (character and frequency)
    public static void displayCharacterFrequency(String[][] result) {
        System.out.println("Character | Frequency");
        System.out.println("-----------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "        | " + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Find the character frequency
        String[][] result = findCharacterFrequency(inputString);

        displayCharacterFrequency(result);


    }
}