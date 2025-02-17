package java_methods.level1;

import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Handshakes are not possible with less than 2 students.");
        } else {
            int handshakes = calculateHandshakes(n);
            System.out.println("The maximum number of handshakes possible is: " + handshakes);
        }
    }

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
