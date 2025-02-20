package java_strings.level3;

import java.util.*;

public class CardGame {

    // Method to initialize the deck of cards with suits and ranks
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        Random random = new Random();

        // Shuffle the deck using Fisher-Yates shuffle algorithm
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + random.nextInt(deck.length - i); // Random index from i to end of the deck
            // Swap the cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    // Method to distribute the deck of n cards to x players
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        // Check if the deck can be evenly distributed to the players
        if (numPlayers * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }

        // Create a 2D array to store the players and their cards
        String[][] playersCards = new String[numPlayers][cardsPerPlayer];
        int index = 0;

        // Distribute the cards
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersCards[i][j] = deck[index++];
            }
        }

        return playersCards;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i + 1) + " cards: ");
            for (int j = 0; j < playersCards[i].length; j++) {
                System.out.print(playersCards[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each player
        }
    }

    public static void main(String[] args) {
        // Initialize the deck
        String[] deck = initializeDeck();

        // Shuffle the deck
        deck = shuffleDeck(deck);

        // Number of players and cards per player
        int numPlayers = 4;  // Example: 4 players
        int cardsPerPlayer = 5;  // Example: Each player gets 5 cards

        // Distribute the cards to the players
        String[][] playersCards = distributeCards(deck, numPlayers, cardsPerPlayer);

        // Print the players and their cards
        if (playersCards != null) {
            printPlayersCards(playersCards);
        }
    }
}