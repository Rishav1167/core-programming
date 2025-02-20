package java_strings.level2;

import java.util.*;

public class SplitTextFindShortestLongest{
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

    public static String[][] generate2D(String[] wordArr){
        String[][] wordArr2D = new String[wordArr.length][2];
        for (int i = 0; i < wordArr.length; i++){
            wordArr2D[i][0] = wordArr[i];
            wordArr2D[i][1] = String.valueOf(getLength(wordArr[i]));
        }

        return wordArr2D;
    }

    public static int[] findShortestLongest(String[][] wordArr2D){
        int[] arr = new int[2];
        arr[0] = Integer.MAX_VALUE;
        arr[1] = Integer.MIN_VALUE;
        for (int i = 0; i < wordArr2D.length; i++){
            int x = Integer.parseInt(wordArr2D[i][1]);
            if (x < arr[0]){
                arr[0] = x;
            }
            if (x > arr[1]){
                arr[1] = x;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = sc.nextLine();

        String[] customSplitWords = splitStr(text);

        String[][] words2D = generate2D(customSplitWords);

        int[] shortlong = findShortestLongest(words2D);

        System.out.println("shortest: " + shortlong[0]);
        System.out.println("longest: " + shortlong[1]);

    }
}