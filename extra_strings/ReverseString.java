package extra_strings;

import java.util.*;

public class ReverseString{
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        int start = 0;
        int end = sb.length()-1;
        while (start <= end){
            char s = sb.charAt(start);
            char e = sb.charAt(end);
            sb.setCharAt(start, e);
            sb.setCharAt(end, s);
            start++;
            end--;
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(reverse(str));
    }
}