package extra_strings;

import java.util.*;
public class ToggleCase{
    public static String toggleCases(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                sb.append(String.valueOf(ch).toUpperCase());
            } else{
                sb.append(String.valueOf(ch).toLowerCase());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String str = "helloWORLD";
        System.out.println(toggleCases(str));
    }
}