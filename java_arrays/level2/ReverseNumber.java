package java_arrays.level2;

import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int temp = num, count = 0;

        //Finding the count of digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count]; //creating array of size count

        temp = num;

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10; //extracting last digit
            temp /= 10; //removing last digit
        }

        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

    }

}