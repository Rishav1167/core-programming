package java_strings.level3;

import java.util.Scanner;

public class CharFrequencyUniq {

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String str) {
        // Temporary array to store unique characters
        char[] uniqueChars = new char[str.length()];
        int index = 0;

        // Loop to find the unique characters
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Check if the character has already appeared
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[index] = currentChar;
                index++;
            }
        }

        // Create a new array of exact size (index points to the number of unique characters)
        char[] result = new char[index];
        System.arraycopy(uniqueChars, 0, result, 0, index);
        return result;
    }

    // Method to find the frequency of characters in a string and return the result as a 2D array
    public static String[][] findCharacterFrequency(String str) {
        // Array to store the frequency of characters (256 possible ASCII characters)
        int[] frequency = new int[256];

        // Loop through the string to count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            frequency[currentChar]++;  // Increment the count for this character
        }

        // Find unique characters using the uniqueCharacters method
        char[] uniqueChars = uniqueCharacters(str);

        // Create a 2D array to store the unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop through unique characters and store the character and its frequency
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // Store character as a string
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]); // Store frequency as string
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