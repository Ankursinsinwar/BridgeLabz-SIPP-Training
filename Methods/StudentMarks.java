package Methods;

import java.util.Random;
import java.util.Scanner;
public class StudentMarks {

    public static int[][] generateMarks(int students, int subjects) {
        Random rand = new Random();
        int[][] marks = new int[students][subjects];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                marks[i][j] = 50 + rand.nextInt(51);
            }
        }
        return marks;
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    public static void displayMarksReport(int[][] marks) {
        System.out.printf("%-8s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-6s\n",
                "RollNo", "Physics", "Chemistry", "Maths", "Total", "Average", "Percent", "Grade");

        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            String grade = getGrade(percentage);

            System.out.printf("%-8d", i + 1);
            for (int j = 0; j < marks[i].length; j++) {
                System.out.printf(" | %-10d", marks[i][j]);
            }
            System.out.printf(" | %-10d | %-10.2f | %-10.2f | %-6s\n", total, average, percentage, grade);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int[][] marks = generateMarks(students, 3);
        displayMarksReport(marks);
        sc.close();
    }
}
