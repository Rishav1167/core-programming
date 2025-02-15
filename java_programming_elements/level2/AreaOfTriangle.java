package java_programming_elements.level2;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        System.out.println("The area of the triangle is " + (0.5 * base * height) + " square units");
    }
}
