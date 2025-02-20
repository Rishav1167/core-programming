package java_strings.level3;

import java.util.Scanner;

public class UniqueChar {

    // Method to find the length of the string without using String length() method
    public static int getStringLength(String str) {
        int length = 0;
        // Iterate through each character using charAt() to calculate the length
        while (true) {
            try {
                str.charAt(length); // Try accessing the character at the given index
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break; // Break when the index is out of bounds (end of string)
            }
        }
        return length;
    }

    // Method to find unique characters using charAt() method
    public static char[] findUniqueCharacters(String str) {
        int length = getStringLength(str);
        char[] uniqueChars = new char[length];
        int index = 0;

        // Outer loop to go through each character
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Inner loop to check if the character is already present before the current index
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

        // Create a new array of the exact size of unique characters
        char[] result = new char[index];
        System.arraycopy(uniqueChars, 0, result, 0, index);
        return result;
    }

    // Method to display the unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Find unique characters
        char[] uniqueCharacters = findUniqueCharacters(inputString);

        displayUniqueCharacters(uniqueCharacters);


    }
}