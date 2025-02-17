package java_arrays.level1;
import java.util.*;
public class EvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Not a natural number");
            return;
        }

        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];
        int evenIndex = 0, oddIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        System.out.println("Even numbers: " + Arrays.toString(Arrays.copyOf(evenNumbers, evenIndex)));
        System.out.println("Odd numbers: " + Arrays.toString(Arrays.copyOf(oddNumbers, oddIndex)));
    }
}
