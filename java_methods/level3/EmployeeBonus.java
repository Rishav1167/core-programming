package java_methods.level3;

import java.util.Random;

public class EmployeeBonus {


    public static double[][] calculateNewSalaries(int[][] employees) {
        int numEmployees = employees.length;
        double[][] updatedData = new double[numEmployees][2];

        for (int i = 0; i < numEmployees; i++) {
            int salary = employees[i][0];
            int years = employees[i][1];

            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonusAmount = salary * bonusPercentage;
            double newSalary = salary + bonusAmount;

            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonusAmount;
        }
        return updatedData;
    }

    // Method to display results
    public static void displayResults(int[][] employees, double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-10s %-10s %-10s %-12s %-12s%n", "Emp ID", "Old Salary", "Years", "New Salary", "Bonus Amount");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < employees.length; i++) {
            int oldSalary = employees[i][0];
            int years = employees[i][1];
            double newSalary = updatedData[i][0];
            double bonus = updatedData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-10d %-10d %-12.2f %-12.2f%n", (i + 1), oldSalary, years, newSalary, bonus);
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-10.2f %-10s %-12.2f %-12.2f%n", "TOTAL", totalOldSalary, "", totalNewSalary, totalBonus);
    }

    // Main method
    public static void main(String[] args) {
        int numEmployees = 10;
        int[][] employees = new int[numEmployees][2];
        Random random = new Random();
        for (int i = 0; i < numEmployees; i++) {
            employees[i][0] = 10000 + random.nextInt(90000);
            employees[i][1] = random.nextInt(10) + 1;
        }
        double[][] updatedData = calculateNewSalaries(employees);
        displayResults(employees, updatedData);
    }
}