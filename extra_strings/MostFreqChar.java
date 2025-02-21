package extra_strings;

import java.util.*;
public class MostFreqChar{
    public static char findMostFreq(String str){
        int mostCount = Integer.MIN_VALUE;
        char mostFreqChar = ' ';
        for (int i = 0; i < str.length()-1; i++){
            int count = 1;
            for (int j = i + 1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if (count > mostCount){
                mostCount = count;
                mostFreqChar = str.charAt(i);
            }
        }
        return mostFreqChar;
    }

    public static void main(String[] args){
        String s = "success";
        System.out.println(findMostFreq(s));
    }
}
