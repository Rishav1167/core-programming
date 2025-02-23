package extra_built_in_functions.level2;

import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int terms = sc.nextInt();

        // Generate Fibonacci sequence
        generateFibonacci(terms);
    }

    // Function to generate and print Fibonacci sequence
    private static void generateFibonacci(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
