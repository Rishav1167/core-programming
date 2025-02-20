package java_strings.level3;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Check palindrome using all three methods
        boolean method1 = isPalindromeTwoPointer(text);
        boolean method2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean method3 = isPalindromeCharArray(text);

        System.out.println("\nResults:");
        System.out.println("Two-Pointer Method: " + (method1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Recursive Method  : " + (method2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Char Array Method : " + (method3 ? "Palindrome" : "Not a Palindrome"));

    }

    // Logic 1: Two-Pointer Method
    public static boolean isPalindromeTwoPointer(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Mismatch found
            }
            start++;
            end--;
        }
        return true; // All characters matched
    }

    // Logic 2: Recursive Method
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true; // Base case
        if (str.charAt(start) != str.charAt(end)) return false; // Mismatch found
        return isPalindromeRecursive(str, start + 1, end - 1); // Recursive call
    }

    // Logic 3: Character Array Method
    public static boolean isPalindromeCharArray(String str) {
        char[] original = str.toCharArray();
        char[] reversed = reverseString(str);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false; // Mismatch found
            }
        }
        return true; // All characters matched
    }

    // Helper Method: Reverse String using charAt()
    public static char[] reverseString(String str) {
        char[] reversed = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            reversed[i] = str.charAt(str.length() - 1 - i); // Reverse character order
        }
        return reversed;
    }
}