package java_control_flow.level2;
import java.util.*;

class EmployeeBonus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int year = sc.nextInt();
        double bonus = 0;

        if (year > 5){
            bonus = salary * 0.05;
        }

        System.out.println(bonus);

    }
}
