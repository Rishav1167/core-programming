package java_control_flow.level1;
import java.util.*;

class SpringSeason {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        if (month > 3 && month < 6){
            System.out.println("Spring Season");
        } else if (month == 3 && day >= 20){
            System.out.println("Spring Season");
        } else if (month == 6 && day <= 20){
            System.out.println("Spring Season");
        } else{
            System.out.println("Not Spring Season");
        }
    }
}