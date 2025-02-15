package java_control_flow.level1;
import java.util.*;

public class naturalNumbersSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0){
            int sum = num * (num-1) / 2;
            System.out.printf("The sum of %d natural numbers is %d", num, sum);
        }
        else {
            System.out.printf("The number %d is not a natural number", num);
        }
    }
}