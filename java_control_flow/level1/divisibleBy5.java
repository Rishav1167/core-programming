package java_control_flow.level1;
import java.util.*;

public class divisibleBy5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean flag = false;
        if (num % 5 == 0){
            flag = true;
        }

        if (flag){
            System.out.printf("Is the number %d divisible by 5? Yes", num);
        }else{
            System.out.printf("Is the number %d divisible by 5? No", num);
        }
    }
}