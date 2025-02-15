package java_programming_elements.level1;

import java.util.Scanner;

public class DistConversion {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();
        double yards = feet / 3;
        double miles = feet / 5280;
        System.out.println("The distance in yards is " + yards + " and in miles is " + miles);
    }
}
