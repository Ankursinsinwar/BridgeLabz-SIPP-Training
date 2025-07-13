package SortingAlgorithms;

import java.util.Scanner;

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}

class ExamScoreSorter {
    public void selectionSort(Student[] students) {
        int n = students.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (students[j].getScore() < students[minIndex].getScore()) {
                    minIndex = j;
                }
            }

            // Swap
            Student temp = students[minIndex];
            students[minIndex] = students[i];
            students[i] = temp;
        }
    }

    public void displaySortedScores(Student[] students) {
        System.out.println("\nSorted student scores in ascending order:");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getScore());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();

            System.out.print("Enter score of " + name + ": ");
            int score = sc.nextInt();
            sc.nextLine(); // Consume newline

            students[i] = new Student(name, score);
        }

        ExamScoreSorter sorter = new ExamScoreSorter();
        sorter.selectionSort(students);
        sorter.displaySortedScores(students);
        sc.close();
    }
}
