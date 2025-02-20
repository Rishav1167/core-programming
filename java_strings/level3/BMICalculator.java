package java_strings.level3;

import java.util.Scanner;

public class BMICalculator {


    // Method to compute BMI and Status
    public static String[] calculateBMIStatus(double weight, double height) {
        double bmi = weight / (height * height);
        String status = "";

        // Determine BMI Status
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obesity";
        }


        return new String[] {String.format("%.2f", bmi), status};
    }

    // Method to process the input and calculate BMI for each person
    public static String[][] processBMIData(double[][] data) {
        String[][] result = new String[10][4];  // To store height, weight, BMI, and status

        // Loop through all 10 members
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];

            // Convert height from cm to meters
            double heightInM = heightInCm / 100;


            String[] bmiStatus = calculateBMIStatus(weight, heightInM);


            result[i][0] = String.format("%.2f", heightInCm);  // Height in cm
            result[i][1] = String.format("%.2f", weight);      // Weight in kg
            result[i][2] = bmiStatus[0];                       // BMI value
            result[i][3] = bmiStatus[1];                       // BMI status
        }

        return result;
    }

    public static void displayBMIData(String[][] data) {

        System.out.printf("%-10s%-10s%-10s%-20s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");

        // Displaying each person's data
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s%-10s%-10s%-20s\n", data[i][0], data[i][1], data[i][2], data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] teamData = new double[10][2];  // To store weight (kg) and height (cm) for 10 members

        // Taking user input for weight and height of each person
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");

            System.out.print("Enter weight (kg): ");
            teamData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            teamData[i][1] = sc.nextDouble();

            System.out.println();
        }

        String[][] resultData = processBMIData(teamData);


        displayBMIData(resultData);


    }
}