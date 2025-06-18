package Arrays;

import java.util.Scanner;;
public class GradeCalculater2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // [student][subject]
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = switch (j) {
                    case 0 -> "Physics";
                    case 1 -> "Chemistry";
                    case 2 -> "Maths";
                    default -> "Subject";
                };
                System.out.print(subject + " marks: ");
                marks[i][j] = sc.nextInt();

                if (marks[i][j] < 0) {
                    System.out.println("Marks cannot be negative. Try again.");
                    j--;
                }
            }

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 80) grade[i] = 'B';
            else if (percentage[i] >= 70) grade[i] = 'C';
            else grade[i] = 'D';
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": % = " + percentage[i] + ", Grade = " + grade[i]);
        }
        sc.close();
    }
}
