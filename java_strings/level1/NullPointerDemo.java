package java_strings.level1;

import java.util.*;
class NullPointerDemo {
    public static void main(String[] args) {


        // Generating NullPointerException
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e);
        }

        // Handling NullPointerException
        handleException();
    }

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // Initializing to null
        System.out.println(text.length()); // This will cause NullPointerException
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null; // Initializing to null
        try {
            System.out.println(text.length()); // This will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled: " + e);
        }
    }
}
