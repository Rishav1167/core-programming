package java_strings.level2;

import java.util.*;

public class TrimSpaces{

    public static int[] trimIdx(String s){
        int startIdx = 0;
        int endIdx = s.length()-1;

        while (s.charAt(startIdx) == ' ' && startIdx < endIdx){
            startIdx++;
        }

        while (s.charAt(endIdx) == ' ' && startIdx < endIdx){
            endIdx--;
        }

        int[] ans = new int[]{startIdx, endIdx};
        return ans;
    }

    public static String substr(String s, int start, int end){
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compare(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }

        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] trimmedIdx = trimIdx(s);

        String str = substr(s, trimmedIdx[0], trimmedIdx[1]);

        System.out.println("Trimmed: " + str);

        System.out.println("Comparison: " + compare(str, s));
    }
}
