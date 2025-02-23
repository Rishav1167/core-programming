package extra_built_in_functions.level2;

import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take three integer inputs
        int num1 = getInput(scanner, "Enter first number: ");
        int num2 = getInput(scanner, "Enter second number: ");
        int num3 = getInput(scanner, "Enter third number: ");

        // Find the maximum number
        int max = findMax(num1, num2, num3);


        System.out.println("The maximum number is: " + max);
    }

    // Function to take integer input
    private static int getInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    // Function to find the maximum of three numbers
    private static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}