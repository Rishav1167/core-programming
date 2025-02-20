package java_strings.level2;

import java.util.*;

public class VowelsConsonants{

    public static int[] findVC(String s){
        int[] count = new int[5];
        Arrays.fill(count, 0);

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            if (ch >= 'a' && ch <= 'z'){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    System.out.println(ch + ": Vowel");
                    if (ch == 'a') count[0]++;
                    if (ch == 'e') count[1]++;
                    if (ch == 'i') count[2]++;
                    if (ch == 'o') count[3]++;
                    if (ch == 'u') count[4]++;
                }
                else {
                    System.out.println(ch + ": Consonant");
                }
            } else{
                System.out.println(ch + ": Not a Word");
            }
        }
        return count;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] count = findVC(s);

        for (int i : count){
            System.out.println(i);
        }
    }
}
