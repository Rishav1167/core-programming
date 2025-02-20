package java_strings.level3;

import java.util.Scanner;

public class AnagramChecker {
    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] frequencyText1 = new int[256];
        int[] frequencyText2 = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            frequencyText1[text1.charAt(i)]++;
            frequencyText2[text2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (frequencyText1[i] != frequencyText2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first text: ");
        String text1 = sc.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = sc.nextLine();

        // Checking if the two texts are anagrams
        if (areAnagrams(text1, text2)) {
            System.out.println("The two texts are anagrams.");
        } else {
            System.out.println("The two texts are not anagrams.");
        }
    }
}
