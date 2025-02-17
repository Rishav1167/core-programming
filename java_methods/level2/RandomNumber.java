package java_methods.level2;

import java.util.*;

public class RandomNumber {
    public class RandomNumbersStats {

        public static int[] generate4DigitRandomArray(int size) {
            Random random = new Random();
            int[] numbers = new int[size];
            for (int i = 0; i < size; i++) {
                numbers[i] = 1000 + random.nextInt(9000);
            }
            return numbers;
        }

        public static double[] findAverageMinMax(int[] numbers) {
            int min = numbers[0], max = numbers[0], sum = 0;
            for (int num : numbers) {
                sum += num;
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
            double average = (double) sum / numbers.length;
            return new double[]{average, min, max};
        }

        public static void main(String[] args) {
            int[] randomNumbers = generate4DigitRandomArray(5);
            System.out.print("Generated numbers: ");
            for (int num : randomNumbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            double[] results = findAverageMinMax(randomNumbers);
            System.out.printf("Average: %.2f\nMinimum: %.0f\nMaximum: %.0f\n", results[0], results[1], results[2]);
        }
    }
}