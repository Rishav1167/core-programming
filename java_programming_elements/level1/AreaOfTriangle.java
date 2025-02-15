package java_programming_elements.level1;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();

        double heightInFeet = height / 30.48;
        double heightInInches = height / 2.54;
        System.out.println("The area of the triangle is " + (0.5 * base * height) + " square units");
        System.out.println("Your Height in cm is " + height +
                " while in feet is " + String.format("%.2f", heightInFeet) +
                " and inches is " + String.format("%.2f", heightInInches));
    }
}
