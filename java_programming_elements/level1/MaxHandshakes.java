package java_programming_elements.level1;

import java.util.Scanner;

public class MaxHandshakes {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("The maximum number of handshakes among " + n + " students is " + ((n * (n - 1)) / 2));
    }
}
