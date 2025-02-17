package java_methods.level3;

import java.util.*;

public class NumberChecker2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Count of Digits: " + countDigits(number));

        int[] digitsArray = getDigitsArray(number);
        System.out.print("Digits Array: ");
        for (int digit : digitsArray) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Sum of Digits: " + sumOfDigits(digitsArray));
        System.out.println("Sum of Squares of Digits: " + sumOfSquaresOfDigits(digitsArray));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digitsArray));

        System.out.println("Digit Frequencies:");
        int[][] frequencyArray = getDigitFrequencies(digitsArray);
        for (int[] row : frequencyArray) {
            System.out.println("Digit: " + row[0] + ", Frequency: " + row[1]);
        }
    }

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigitsArray(int num) {
        ArrayList<Integer> digitList = new ArrayList<>();
        while (num > 0) {
            digitList.add(0, num % 10);
            num /= 10;
        }
        return digitList.stream().mapToInt(i -> i).toArray();
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int num, int[] digits) {
        return num % sumOfDigits(digits) == 0;
    }

    public static int[][] getDigitFrequencies(int[] digits) {
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }

        int count = (int) Arrays.stream(freq).filter(f -> f > 0).count();
        int[][] result = new int[count][2];
        int index = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }
}