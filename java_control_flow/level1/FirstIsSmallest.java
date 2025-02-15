package java_control_flow.level1;
import java.util.*;

class FirstIsSmallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 < num2 && num1 < num3){
            System.out.printf("Is the first number the smallest? Yes");
        }else{
            System.out.printf("Is the first number the smallest? No");
        }
    }
}
