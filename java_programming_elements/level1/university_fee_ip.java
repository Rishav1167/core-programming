package java_programming_elements.level1;

import java.util.Scanner;

public class university_fee_ip {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        double fee = input.nextDouble();
        double discountPercent = input.nextDouble();
        double discount = (fee * discountPercent) / 100;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fee - discount));
    }
}
