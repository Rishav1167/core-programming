package java_arrays.level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EMPLOYEE_COUNT = 10;
        double[] salaries = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonuses = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking input from user
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + " (positive number): ");
            if (scanner.hasNextDouble()) {
                salaries[i] = scanner.nextDouble();
                if (salaries[i] <= 0) {
                    System.out.println("Error: Salary must be a positive number. Please try again.");
                    i--; // Decrement index to re-enter input
                    continue;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid numeric value.");
                scanner.next(); // Discard invalid input
                i--; // Decrement index to re-enter input
                continue;
            }

            System.out.print("Enter years of service for employee " + (i + 1) + " (non-negative number): ");
            if (scanner.hasNextDouble()) {
                yearsOfService[i] = scanner.nextDouble();
                if (yearsOfService[i] < 0) {
                    System.out.println("Error: Years of service cannot be negative. Please try again.");
                    i--; // Decrement index to re-enter input
                }
            } else {
                System.out.println("Invalid input. Please enter a valid numeric value.");
                scanner.next(); // Discard invalid input
                i--; // Decrement index to re-enter input
            }
        }

        // Calculating bonus and new salary
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            bonuses[i] = (yearsOfService[i] > 5) ? salaries[i] * 0.05 : salaries[i] * 0.02;
            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display results
        System.out.println("\nSummary Report:");
        System.out.println("------------------------------------");
        System.out.println("Total old salary of all employees: " + totalOldSalary);
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total new salary of all employees: " + totalNewSalary);
        System.out.println("------------------------------------");

        scanner.close();
    }
}

}
