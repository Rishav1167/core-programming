package java_arrays.level2;

import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            System.out.print("Height in cm : ");
            heights[i] = sc.nextDouble();
        }

        // Finding the youngest friend
        int minAge = ages[0];
        String youngest = names[0];

        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }

        // Finding the tallest friend
        double maxHeight = heights[0];
        String tallest = names[0];

        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }

        System.out.println("\nYoungest Friend: " + youngest + " and the Age is " + minAge + "");
        System.out.println("Tallest Friend: " + tallest + " and the Height is " + maxHeight + " cm ");
    }
}
