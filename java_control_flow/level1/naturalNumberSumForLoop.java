package java_control_flow.level1;
import java.util.Scanner;

public class naturalNumberSumForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;

        for (int temp = 1; temp < num; temp++) {
            sum += temp;
        }

        int nsum = num * (num - 1) / 2;

        if (nsum == sum) {
            System.out.println("equal");
        }

        System.out.println(sum);
    }

}