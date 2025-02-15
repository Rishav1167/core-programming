package java_control_flow.level1;
import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("The number " + number + " is not a natural number.");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }
    }

}