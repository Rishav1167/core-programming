package java_strings.level2;

import java.util.*;

public class RockPaperScissor {

    // Method to find the Computer's choice using Math.random
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "Rock";
        else if (choice == 1) return "Paper";
        else return "Scissors";
    }

    // Method to find the winner between the user and the computer
    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) return "Draw";
        if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    // Method to display the stats after all games
    public static void displayStats(int playerWins, int computerWins, int totalGames) {
        double playerWinPercentage = (double) playerWins / totalGames * 100;
        double computerWinPercentage = (double) computerWins / totalGames * 100;

        System.out.println("\nResults:");
        System.out.println("Player Wins: " + playerWins + " | Computer Wins: " + computerWins);
        System.out.println("Player Win Percentage: " + playerWinPercentage + "%");
        System.out.println("Computer Win Percentage: " + computerWinPercentage + "%");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of games to play
        System.out.print("Enter the number of games to play: ");
        int totalGames = sc.nextInt();
        sc.nextLine();  // Consume the leftover newline

        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < totalGames; i++) {
            // User's choice input
            System.out.print("\nEnter your choice (Rock, Paper, Scissors): ");
            String userChoice = sc.nextLine().trim();

            // Get computer's choice
            String computerChoice = getComputerChoice();
            System.out.println("Computer's choice: " + computerChoice);

            // Find and print the winner
            String winner = findWinner(userChoice, computerChoice);
            if (winner.equals("Player")) {
                playerWins++;
                System.out.println("You win this round!");
            } else if (winner.equals("Computer")) {
                computerWins++;
                System.out.println("Computer wins this round!");
            } else {
                System.out.println("It's a draw!");
            }
        }

        displayStats(playerWins, computerWins, totalGames);

    }
}
