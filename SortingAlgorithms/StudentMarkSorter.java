package SortingAlgorithms;

import java.util.Scanner;

public class StudentMarkSorter {

    static class Student {
        private String name;
        private int[] marks;

        public Student(String name, int[] marks) {
            this.name = name;
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public int[] getMarks() {
            return marks;
        }

        public void sortMarks() {
            int n = marks.length;
            boolean swapped;

            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (marks[j] > marks[j + 1]) {
                        int temp = marks[j];
                        marks[j] = marks[j + 1];
                        marks[j + 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped) break;
            }
        }

        public void displaySortedMarks() {
            System.out.print(name + "'s sorted marks: ");
            for (int mark : marks) {
                System.out.print(mark + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter number of subjects per student: ");
        int numSubjects = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();

            int[] marks = new int[numSubjects];
            System.out.println("Enter " + numSubjects + " marks for " + name + ":");
            for (int j = 0; j < numSubjects; j++) {
                marks[j] = sc.nextInt();
            }
            sc.nextLine(); // consume newline

            students[i] = new Student(name, marks);
        }

        System.out.println("\nSorted Marks (using Bubble Sort):");
        for (Student student : students) {
            student.sortMarks();
            student.displaySortedMarks();
        }
        sc.close();
    }
}
