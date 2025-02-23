package extra_built_in_functions.level2;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int low = 1, high = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");
        System.out.println("Enter 'high' if my guess is too high, 'low' if it's too low, or 'correct' if I guessed it.");

        while (true) {
            guess = generateGuess(low, high, random);
            System.out.println("Is your number " + guess + "?");
            feedback = sc.nextLine().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("Hooray! I guessed your number!");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;  // Adjust range
            } else if (feedback.equals("low")) {
                low = guess + 1;  // Adjust range
            } else {
                System.out.println("Invalid input! Please enter 'high', 'low', or 'correct'.");
            }

            if (low > high) {
                System.out.println("Oops! Something went wrong. Did you change your number?");
                break;
            }
        }

    }

    // Function to generate a guess within the given range
    private static int generateGuess(int low, int high, Random random) {
        return low + random.nextInt(high - low + 1);
    }
}