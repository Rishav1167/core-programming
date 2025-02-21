package extra_strings;

import java.util.*;

public class RemoveDuplicates{
    public static String rmDuplicates(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (sb.indexOf(String.valueOf(ch)) == -1){
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(rmDuplicates(str));
    }
}