package java_programming_elements.level1;

import java.util.Scanner;

public class Side_Of_Square {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perimeter = input.nextDouble();
        System.out.println("The length of the side is " + (perimeter / 4) + " whose perimeter is " + perimeter);
    }
}
