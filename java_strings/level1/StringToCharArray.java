package java_strings.level1;

import java.util.Scanner;

public class StringToCharArray {
    public static char[] getCharsWithoutToCharArray(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        sc.close();

        char[] userDefinedArray = getCharsWithoutToCharArray(str);
        char[] builtInArray = str.toCharArray();

        System.out.println("Comparison result: " + compareCharArrays(userDefinedArray, builtInArray));
    }
}
