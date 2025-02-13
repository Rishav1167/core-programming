package java_programming_elements.level2;

import java.util.Scanner;

public class IntOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt() , b=sc.nextInt() , c=sc.nextInt();
        System .out.print(" The results of Int Operations are "+ (a+b*c) + " , " + (a*b+c) + " , "+ (c+a/b) +  " and "+ (a%b+c) ); 
    }
}
