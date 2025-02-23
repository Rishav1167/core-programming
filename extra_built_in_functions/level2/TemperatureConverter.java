package extra_built_in_functions.level2;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        if (choice == 1) {
            System.out.println(temperature + "°F is " + fahrenheitToCelsius(temperature) + "°C");
        } else if (choice == 2) {
            System.out.println(temperature + "°C is " + celsiusToFahrenheit(temperature) + "°F");
        } else {
            System.out.println("Invalid choice!");
        }
    }

    // Function to convert Fahrenheit to Celsius
    private static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    private static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
