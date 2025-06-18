package Arrays;

import java.util.Scanner;

public class GradeCalculater1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            System.out.print("Physics marks: ");
            physics[i] = sc.nextInt();
            if (physics[i] < 0) {
                System.out.println("Marks can't be negative. Enter again.");
                i--;
                continue;
            }

            System.out.print("Chemistry marks: ");
            chemistry[i] = sc.nextInt();
            if (chemistry[i] < 0) {
                System.out.println("Marks can't be negative. Enter again.");
                i--;
                continue;
            }

            System.out.print("Maths marks: ");
            maths[i] = sc.nextInt();
            if (maths[i] < 0) {
                System.out.println("Marks can't be negative. Enter again.");
                i--;
                continue;
            }

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 80)
                grade[i] = 'B';
            else if (percentage[i] >= 70)
                grade[i] = 'C';
            else
                grade[i] = 'D';
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Physics: " + physics[i]);
            System.out.println("  Chemistry: " + chemistry[i]);
            System.out.println("  Maths: " + maths[i]);
            System.out.println("  Percentage: " + percentage[i]);
            System.out.println("  Grade: " + grade[i]);
        }
        sc.close();
    }
}
