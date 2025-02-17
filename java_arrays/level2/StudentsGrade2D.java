package java_arrays.level2;

import java.util.Scanner;

public class StudentsGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();

        String[] subjects = {"Physics", "Chemistry", "Maths"};
        double[][] studentData = new double[number][5];
        char[] grades = new char[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            double totalMarks = 0;
            for (int j = 0; j < 3; j++) {
                while (true) {
                    System.out.print("Enter marks for " + subjects[j] + " (0-100): ");
                    double mark = sc.nextDouble();
                    if (mark >= 0 && mark <= 100) {
                        studentData[i][j] = mark;
                        totalMarks += mark;
                        break;
                    } else {
                        System.out.println("Invalid input! Please enter a value between 0 and 100.");
                    }
                }
            }

            // Store total marks and percentage in the 2D array
            studentData[i][3] = totalMarks;
            studentData[i][4] = totalMarks / 3.0;

            // Assigning grade
            if (studentData[i][4] >= 80) {
                grades[i] = 'A';
            } else if (studentData[i][4] >= 70) {
                grades[i] = 'B';
            } else if (studentData[i][4] >= 60) {
                grades[i] = 'C';
            } else if (studentData[i][4] >= 50) {
                grades[i] = 'D';
            } else if (studentData[i][4] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'F';
            }
        }

        System.out.println("\nStudent Report:");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Physics\tChemistry\tMaths\tTotal\tPercentage\tGrade\tRemarks");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < number; i++) {
            String remarks;
            switch (grades[i]) {
                case 'A': remarks = "Level 4"; break;
                case 'B': remarks = "Level 3"; break;
                case 'C': remarks = "Level 2"; break;
                case 'D': remarks = "Level 1"; break;
                case 'E': remarks = "Level 1 - LOW"; break;
                default: remarks = "Remedial"; break;
            }

            System.out.println((int)studentData[i][0] + "\t" + (int)studentData[i][1] + "\t\t" + (int)studentData[i][2] + "\t" +
                    (int)studentData[i][3] + "\t" + String.format("%.2f", studentData[i][4]) + "\t\t" + grades[i] + "\t" + remarks);
        }
    }
}
