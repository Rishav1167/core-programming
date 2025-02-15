package java_programming_elements.level1;

import java.util.Scanner;

public class KmToMile_ip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km = input.nextDouble();
        System.out.println("The total miles is " + (km / 1.6) + " mile for the given " + km + " km");
    }
}
