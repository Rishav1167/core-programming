package java_methods.level3;
import java.util.*;
public class NumberChecker3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Count of Digits: " + countDigits(number));

        int[] digitsArray = getDigitsArray(number);
        System.out.print("Digits Array: ");
        printArray(digitsArray);

        int[] reversedArray = reverseArray(digitsArray);
        System.out.print("Reversed Digits Array: ");
        printArray(reversedArray);

        System.out.println("Are Original and Reversed Arrays Equal: " + areArraysEqual(digitsArray, reversedArray));
        System.out.println("Is Palindrome Number: " + isPalindrome(digitsArray));
        System.out.println("Is Duck Number: " + isDuckNumber(digitsArray));
    }

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigitsArray(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int[] digits) {
        return areArraysEqual(digits, reverseArray(digits));
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
