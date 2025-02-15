package java_control_flow.level1;
import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number >= 6 && number <=9){
            for (int i = 6; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
        else{
            System.out.println("Please Enter no between 6 to 9");
        }
    }

}
