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

        // Taking input from user in one go
        System.out.println("Enter salary and years of service for " + EMPLOYEE_COUNT + " employees (Format: salary year_of_service):");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            if (scanner.hasNextDouble()) {
                salaries[i] = scanner.nextDouble();
                if (salaries[i] <= 0) {
                    System.out.println("Error: Salary must be a positive number. Please enter again.");
                    i--; // Re-enter input for the same employee
                    continue;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid numeric salary.");
                scanner.nextLine(); // Discard invalid input
                i--;
                continue;
            }

            if (scanner.hasNextDouble()) {
                yearsOfService[i] = scanner.nextDouble();
                if (yearsOfService[i] < 0 || yearsOfService[i] > 25) {
                    System.out.println("Error: Years of service must be between 0 and 25. Please enter again.");
                    i--;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid numeric years of service.");
                scanner.nextLine(); // Discard invalid input
                i--;
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


        System.out.println("Total old salary of all employees: " + totalOldSalary);
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total new salary of all employees: " + totalNewSalary);

        scanner.close();
    }
}
