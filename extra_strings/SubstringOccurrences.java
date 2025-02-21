package extra_strings;

import java.util.*;

public class SubstringOccurrences{

    public static int findCount(String str, String subStr){
        int count = 0;
        for (int i = 0; i <= str.length()-subStr.length(); i++){
            if (str.substring(i, i+subStr.length()).equals(subStr)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String str = "hellotherehello";
        String subStr = "hello";

        System.out.println(findCount(str, subStr));
    }
}