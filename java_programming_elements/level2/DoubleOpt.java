package java_programming_elements.level2;

import java.util.Scanner;

public class DoubleOpt {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble() , b=sc.nextDouble() , c=sc.nextDouble();
        System .out.print(" The results of Double Operations are "+ (a+b*c) + " , " + (a*b+c) + " , "+ (c+a/b) +  " and "+ (a%b+c) ); 
    }
}
