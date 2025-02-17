package java_arrays.level2;

import java.util.Scanner;

public class LargestAndSeondLargestDynamicSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (num != 0) {
            // If array is full, increase size
            if (index == maxDigit) {
                maxDigit += 10;  // Increase size by 10
                int[] temp = new int[maxDigit];  // Create a larger array

                // Copy existing elements manually
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;  // Assign the new larger array
            }

            digits[index++] = num % 10;  // Store last digit in array
            num /= 10;  // Remove last digit
        }

        // If no digits were found (input was 0), exit
        if (index == 0) {
            System.out.println("No digits found.");
            return;
        }

        // Initialize  largest and second largest
        int largest = digits[0];
        int secondLargest = -1;

        // find the largest and second largest digits
        for (int i = 1; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest != -1 ? secondLargest : "Not available"));
    }
}
