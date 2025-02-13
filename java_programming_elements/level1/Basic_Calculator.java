package java_programming_elements.level1;

import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + a + " and " + b + " is " +
                           (a + b) + ", " + (a - b) + ", " + (a * b) + ", and " + (a / b));
    }
}
