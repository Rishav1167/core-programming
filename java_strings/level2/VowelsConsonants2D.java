package java_strings.level2;

import java.util.*;

public class VowelsConsonants2D{

    public static String[][] findVC(String s){
        String[][] ans = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            if (ch >= 'a' && ch <= 'z'){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    ans[i][0] = String.valueOf(ch);
                    ans[i][1] = "Vowel";
                }
                else {
                    ans[i][0] = String.valueOf(ch);
                    ans[i][1] = "Consonant";
                }
            } else{
                ans[i][0] = String.valueOf(ch);
                ans[i][1] = "Not a word";
            }
        }
        return ans;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[][] strArr = findVC(s);

        System.out.println("| Word            | Type       |" );
        System.out.println("--------------------------------" );
        for (int i = 0; i < strArr.length; i++){
            System.out.printf("| %-15s | %-10s |\n", strArr[i][0], strArr[i][1]);
        }
    }
}
