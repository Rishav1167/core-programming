package java_strings.level3;

import java.util.Scanner;

public class Calendar {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to get the number of days in a month
    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for leap year in February
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year rule: If divisible by 4, but not by 100, unless also divisible by 400
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    // Method to calculate the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;  // 1st day of the month

        return d0;
    }

    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year) {
        // Get month name and number of days in the month
        String monthName = getMonthName(month);
        int numberOfDays = getNumberOfDays(month, year);
        int firstDayOfMonth = getFirstDayOfMonth(month, year);

        // Display the month and year
        System.out.println("      " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Indentation for the first day
        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("    "); // Print spaces until the first day
        }

        // Print the days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day); // Right-justified output for day
            if ((firstDayOfMonth + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking month and year as input
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter the year: ");
        int year = sc.nextInt();


        displayCalendar(month, year);


    }
}
