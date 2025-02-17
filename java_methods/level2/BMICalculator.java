package java_methods.level2;

import java.util.Scanner;

public class BMICalculator {
        public static void calculateBMI(double[][] personData) {
            for (int i = 0; i < personData.length; i++) {
                double heightInMeters = personData[i][1] / 100;
                personData[i][2] = personData[i][0] / (heightInMeters * heightInMeters);
            }
        }

        public static String getBMIStatus(double bmi) {
            if (bmi < 18.5) return "Underweight";
            else if (bmi < 24.9) return "Normal weight";
            else if (bmi < 29.9) return "Overweight";
            else return "Obese";
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double[][] personData = new double[10][3];
            String[] bmiStatus = new String[10];

            for (int i = 0; i < 10; i++) {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                personData[i][0] = sc.nextDouble();
                System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
                personData[i][1] = sc.nextDouble();
            }

            calculateBMI(personData);

            for (int i = 0; i < 10; i++) {
                bmiStatus[i] = getBMIStatus(personData[i][2]);
            }

            System.out.println("\nPerson Data:");
            System.out.println("Weight (kg) | Height (cm) | BMI | Status");
            for (int i = 0; i < 10; i++) {
                System.out.printf("%.2f | %.2f | %.2f | %s\n",
                        personData[i][0], personData[i][1], personData[i][2], bmiStatus[i]);
            }
        }
}
