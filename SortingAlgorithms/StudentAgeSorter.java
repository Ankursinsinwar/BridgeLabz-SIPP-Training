package SortingAlgorithms;

import java.util.Scanner;

public class StudentAgeSorter {

    static class Student {
        private String name;
        private int age;  // Expected range: 10 to 18

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    public void countingSort(Student[] students) {
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];
        Student[] output = new Student[students.length];

        // Step 1: Count occurrences of each age
        for (Student student : students) {
            count[student.getAge() - minAge]++;
        }

        // Step 2: Compute cumulative count
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Place students into the correct position in output array
        for (int i = students.length - 1; i >= 0; i--) {
            Student student = students[i];
            int ageIndex = student.getAge() - minAge;
            int position = count[ageIndex] - 1;
            output[position] = student;
            count[ageIndex]--;
        }

        // Step 4: Copy sorted data back to original array
        for (int i = 0; i < students.length; i++) {
            students[i] = output[i];
        }
    }

    public void display(Student[] students) {
        System.out.println("\nStudents sorted by age (ascending):");
        for (Student student : students) {
            System.out.println(student.getName() + " - Age " + student.getAge());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentAgeSorter sorter = new StudentAgeSorter();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();

            System.out.print("Enter age of " + name + " (between 10 and 18): ");
            int age = sc.nextInt();
            sc.nextLine();

            if (age < 10 || age > 18) {
                System.out.println("Invalid age! Must be between 10 and 18.");
                i--; // re-try for this index
                continue;
            }

            students[i] = new Student(name, age);
        }

        sorter.countingSort(students);
        sorter.display(students);
        sc.close();
    }
}
