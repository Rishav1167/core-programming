package java_strings.level1;

import java.util.Scanner;

// Compare two strings using charAt() and equals()
public class StringComparison {
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = sc.next();
        System.out.println("Enter second string:");
        String str2 = sc.next();

        boolean customComparison = compareStrings(str1, str2);
        boolean builtInComparison = str1.equals(str2);

        System.out.println("Comparison using charAt: " + customComparison);
        System.out.println("Comparison using equals(): " + builtInComparison);
        System.out.println("Comparing both methods: " + (builtInComparison && customComparison));



        sc.close();
    }
}
