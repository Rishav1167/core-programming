package java_methods.level2;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
            return;
        }

        int sumRecursion = findSumRecursive(n);
        int sumFormula = findSumFormula(n);

        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumRecursion == sumFormula) {
            System.out.println("Both results are equal, computation is correct.");
        } else {
            System.out.println("Results do not match, there is an error in computation.");
        }
    }

    public static int findSumRecursive(int n) {
        if (n == 1) return 1;
        return n + findSumRecursive(n - 1);
    }

    public static int findSumFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}
