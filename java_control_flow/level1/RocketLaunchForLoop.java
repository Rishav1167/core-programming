package java_control_flow.level1;
import java.util.Scanner;

public class RocketLaunchForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int temp = num; temp >= 0; temp--) {
            System.out.print(temp + "... ");
        }

        System.out.println();

        for (int i = num; i >= 0; i--) {
            System.out.print(i + "... ");
        }
    }

}