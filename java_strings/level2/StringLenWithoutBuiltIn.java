package java_strings.level2;

import java.util.*;

public class StringLenWithoutBuiltIn{
    public static int getLength(String s){
        int len = 0;
        while (true){
            try{
                s.charAt(len);
                len++;
            } catch(StringIndexOutOfBoundsException e){
                break;
            }
        }
        return len;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();

        System.out.println("String Length: " + getLength(s));
        System.out.println("String Length using BuiltIn Func: " + s.length());
    }
}
