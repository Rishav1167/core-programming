package java_arrays.level2;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();

        int[][] marks = new int[number][3];
        double[] percentages = new double[number];
        char[] grades = new char[number];
        String[] subjects = {"Physics", "Chemistry", "Maths"};

        // Taking input for marks
        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");


            for (int j = 0; j < 3; j++) {

                while (true) {
                    System.out.print("Enter marks for " + subjects[j] + " (0-100): ");
                    int mark = sc.nextInt();
                    if (mark >= 0 && mark <= 100) {
                        marks[i][j] = mark;
                        break;
                    } else {
                        System.out.println("Invalid input");
                    }
                }
            }

            // Calculate percentage
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totalMarks / 3.0;

            // Assigning grade based
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >=70 && percentages[i] <= 79) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60 && percentages[i] <= 69) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50 && percentages[i] <= 59) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40 && percentages[i] <= 49) {
                grades[i] = 'E';
            }
            else {
                grades[i] = 'F';
            }
        }


        System.out.println("\nStudent Report:");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Physics\tChemistry\tMaths\tTotal\tPercentage\tGrade\tRemarks");
        System.out.println("-------------------------------------------------------------------------");

        for (int i = 0; i < number; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];

            // Determine Remarks
            String remarks;
            switch (grades[i]) {
                case 'A': remarks = "Level 4"; break;
                case 'B': remarks = "Level 3"; break;
                case 'C': remarks = "Level 2"; break;
                case 'D': remarks = "Level 1"; break;
                case 'E': remarks = "Level 1 - LOW"; break;
                default: remarks = "Remedial"; break;
            }
            System.out.println(marks[i][0] + "\t" + marks[i][1] + "\t\t" + marks[i][2] + "\t" +
                    total + "\t" + String.format("%.2f", percentages[i]) + "\t\t" + grades[i]+ "\t" + remarks);
        }

    }
}
