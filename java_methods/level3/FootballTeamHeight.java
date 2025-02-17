package java_methods.level3;

import java.util.Random;
import java.util.Scanner;

public class FootballTeamHeight {

    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int[] heights =new int[11];

        for(int i=0;i<11;i++){
            heights[i]=random.nextInt(101)+150;    // to take random numbers as height b/w 150 - 250

        }
        System.out.print("Player Heights: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        System.out.println("Total Sum of Heights: " + findSum(heights));
        System.out.printf("Mean Height: %.2f%n", findMean(heights));
        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
