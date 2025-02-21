package extra_strings;

import java.util.*;

public class LongestWord{
    public static String findLongest(String str){
        String[] words = str.split(" ");
        String longest = "";
        for (String s : words){
            if (longest.length() < s.length()){
                longest = s;
            }
        }
        return longest;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(findLongest(str));
    }
}