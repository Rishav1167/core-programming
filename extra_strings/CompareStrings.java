package extra_strings;

import java.util.*;
public class CompareStrings{
    public static void compare(String s1, String s2){
        String[] order = new String[2];

        int shortLen = Math.min(s1.length(), s2.length());

        for (int i = 0; i < shortLen; i++){
            if (s1.charAt(i) < s2.charAt(i)){
                order[0] = s1;
                order[1] = s2;
                break;
            } else if (s1.charAt(i) > s2.charAt(i)){
                order[0] = s2;
                order[1] = s1;
                break;
            }
        }

        System.out.printf("\"%s\" comes before \"%s\" in lexicographical order", order[0], order[1]);
    }

    public static void main(String[] args){
        String s1 = "apple";
        String s2 = "banana";

        compare(s1, s2);
    }
}
