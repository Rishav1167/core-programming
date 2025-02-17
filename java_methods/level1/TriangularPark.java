package java_methods.level1;

import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side of the triangular park (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the second side of the triangular park (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the third side of the triangular park (in meters): ");
        double side3 = sc.nextDouble();

        double perimeter = side1 + side2 + side3;
        int rounds = (int) Math.ceil(5000 / perimeter);

        System.out.println("The athlete needs to complete " + rounds + " rounds to finish a 5 km run.");
    }
}
