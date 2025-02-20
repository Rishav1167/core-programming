package java_strings.level1;

import java.util.Scanner;

public class SubstringComparison {
    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        sc.close();

        String subCharAt = substringUsingCharAt(str, start, end);
        String subBuiltIn = str.substring(start, end);

        System.out.println("Substring using charAt: " + subCharAt);
        System.out.println("Substring using built-in method: " + subBuiltIn);
        System.out.println("Are both substrings equal " + (subCharAt.equals(subBuiltIn) ? "YES" : "NO"));

    }
}

