package java_programming_elements.level2;

import java.util.Scanner;

public class Quotient_Reminder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        System.out.print("The Quotient is "+ (n/m) + " and Reminder is "+ (n%m) + " of two number "+ n + " and "+ m );
    }
}
