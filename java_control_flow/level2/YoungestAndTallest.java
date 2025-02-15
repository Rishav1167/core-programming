package java_control_flow.level2;
import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amarAge = sc.nextInt();
        int amarHeight = sc.nextInt();

        int akbarAge = sc.nextInt();
        int akbarHeight = sc.nextInt();

        int anthonyAge = sc.nextInt();
        int anthonyHeight = sc.nextInt();

        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend = (youngestAge == amarAge) ? "Amar" :
                (youngestAge == akbarAge) ? "Akbar" : "Anthony";

        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = (tallestHeight == amarHeight) ? "Amar" :
                (tallestHeight == akbarHeight) ? "Akbar" : "Anthony";

        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

    }
}