package java_strings.level1;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        // Trying to access an index beyond the length of the array

        System.out.println(names[names.length]); // This will throw ArrayIndexOutOfBoundsException
    }

    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            generateArrayIndexOutOfBoundsException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (Exception e) {
            System.out.println("Caught a generic exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the array size and elements
        System.out.print("Enter the number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); // Consume newline character

        String[] names = new String[size];

        // Take user input to populate the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Call method to generate the exception
        generateArrayIndexOutOfBoundsException(names);

        // Call method to handle the exception
        handleArrayIndexOutOfBoundsException(names);
    }
}