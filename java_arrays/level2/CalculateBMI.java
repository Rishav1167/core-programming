package java_arrays.level2;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmiValues = new double[n];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter height in meters : ");
            heights[i] = sc.nextDouble();
            System.out.print("Enter weight in kg : ");
            weights[i] = sc.nextDouble();

            bmiValues[i] = weights[i] / (heights[i] * heights[i]);

            if (bmiValues[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmiValues[i] < 24.9) {
                weightStatus[i] = "Normal Weight";
            } else if (bmiValues[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nBMI Report:");
        System.out.println("------------------------------------------------------");
        System.out.println("Height(m)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println(String.format("%.2f", heights[i]) + "\t\t" +
                    String.format("%.2f", weights[i]) + "\t\t" +
                    String.format("%.2f", bmiValues[i]) + "\t\t" +
                    weightStatus[i]);
        }

    }
}
