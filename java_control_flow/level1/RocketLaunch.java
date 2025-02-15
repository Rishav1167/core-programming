package java_control_flow.level1;
import java.util.*;

public class rocketLaunch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;

        while (temp >= 0){
            System.out.print(temp + "... ");
            temp--;
        }

        System.out.println();

        for (int i = num; i >= 0; i--){
            System.out.print(i + "... ");
        }
    }
}