package java_strings.level2;

import java.util.*;

public class SplitTextIntoWords {

    public static int getLength(String s) {
        int len = 0;
        while (true) {
            try {
                s.charAt(len);
                len++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return len;
    }

    public static int getWordCount(String s) {
        int len = 1;
        for (int i = 0; i < getLength(s); i++) {
            if (s.charAt(i) == ' ') {
                len++;
            }
        }
        return len;
    }

    public static String[] splitStr(String s) {
        s = s.trim();
        String[] arr = new String[getWordCount(s)];

        int wordStart = 0;
        int arrayIndex = 0;

        for (int i = 0; i < getLength(s); i++) {
            if (s.charAt(i) == ' ') {
                arr[arrayIndex] = s.substring(wordStart, i);
                arrayIndex++;
                wordStart = i + 1;
            }
        }

        arr[arrayIndex] = s.substring(wordStart);

        return arr;
    }

    public static boolean compareArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = sc.nextLine();

        String[] customSplitWords = splitStr(text);

        String[] builtInSplitWords = text.split("\\s+");

        boolean areArraysEqual = compareArrays(customSplitWords, builtInSplitWords);

        System.out.println("Words using custom split method: ");
        for (String word : customSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method: ");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both methods' results the same? " + areArraysEqual);

    }
}