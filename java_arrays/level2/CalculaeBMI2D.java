package java_arrays.level2;

import java.util.Scanner;

public class CalculaeBMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            do {
                System.out.print("Enter height in meters : ");
                personData[i][0] = sc.nextDouble();
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter weight in kg : ");
                personData[i][1] = sc.nextDouble();
            } while (personData[i][1] <= 0);

            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal Weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nBMI Report:");
        System.out.println("------------------------------------------------------");
        System.out.println("Height(m)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.println(String.format("%.2f", personData[i][0]) + "\t\t" +
                    String.format("%.2f", personData[i][1]) + "\t\t" +
                    String.format("%.2f", personData[i][2]) + "\t\t" +
                    weightStatus[i]);
        }

    }
}
