package Methods;

import java.util.Scanner;
public class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the ages of student " + (i+1) + ":");
            ages[i] = sc.nextInt();
            if (ages[i] < 0) {
                System.out.println("Enter positive value only");
                sc.close();
                return;
            }
        }

         System.out.printf("%-8s | %-5s | %-15s\n", "Student","Age", "Eligibiliity");
        System.out.println("-------------------------------");
        for (int i = 0; i < ages.length; i++) {
            boolean canVote = checker.canStudentVote(ages[i]);
            System.out.printf("%-8s | %-5s | %-15s\n", (i + 1), ages[i], (canVote ? "Can vote" : "Cannot vote"));
        }
        sc.close();
    }
}