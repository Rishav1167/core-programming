package java_methods.level2;

import java.util.Scanner;

public class StudentVote {
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentAges = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();
            boolean canVote = canStudentVote(studentAges[i]);
            System.out.println("Student " + (i + 1) + (canVote ? " can vote." : " cannot vote."));
        }
    }
}
