package Workshop;

import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
    private String name;
    private String id;
    private Double[] grades;  // Using Double to allow nulls for missing subjects

    public Student(String name, String id, int subjectCount) {
        this.name = name;
        this.id = id;
        this.grades = new Double[subjectCount];
    }

    // setter for grades
    public void setGrade(int subjectIndex, double grade) throws IllegalArgumentException {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
        grades[subjectIndex] = grade;
    }
    
    // getter for grades
    public Double[] getGrades() {
        return grades;
    }
    
    // getter for total grades
    public double getTotal() {
        double total = 0;
        for (Double g : grades) {
            if (g != null) {
                total += g;
            }
        }
        return total;
    }
    
    // getter for average grades
    public double getAverage() {
        int count = 0;
        for (Double g : grades) {
            if (g != null) count++;
        }
        if (count > 0) {
            return getTotal() / count;
        }else{
            return 0;
        }
    }

    // getter for student name 
    public String getName() {
        return name;
    }
    
    // getter for student ID 
    public String getId() {
        return id;
    }

    // methode to check null values [missing] grades
    public boolean hasIncompleteRecord() {
        for (Double g : grades) {
            if (g == null) return true;
        }
        return false;
    }



    // main methode
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();

        Student[] students = new Student[numStudents];

        // Input student details and grades
        for (int i = 0; i < numStudents; i++) {
            sc.nextLine(); // clear buffer
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("ID: ");
            String id = sc.nextLine();
            students[i] = new Student(name, id, numSubjects);

            for (int j = 0; j < numSubjects; j++) {
                while (true) {
                    try {
                        System.out.print("Enter grade for Subject " + (j + 1) + " (0-100 or -1 for missing): ");
                        double grade = sc.nextDouble();
                        if (grade == -1) {
                            // Skip this subject (treat as missing)
                            break;
                        }
                        students[i].setGrade(j, grade);
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a numeric grade.");
                        sc.next(); // consume invalid input
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }

        // Display Total and Average per student
        System.out.println("\n=== Student Totals and Averages ===");
        for (Student student : students) {
            System.out.println("\nName: " + student.getName() + ", ID: " + student.getId());
            if (student.hasIncompleteRecord()) {
                System.out.println("Record incomplete.");
            } else {
                System.out.println("Total: " + student.getTotal());
                System.out.println("Average: " + student.getAverage());
            }
        }

        // Highest grade per subject
        System.out.println("\n=== Highest Grade per Subject ===");
        for (int j = 0; j < numSubjects; j++) {
            double max = -1;
            for (Student student : students) {
                Double grade = student.getGrades()[j];
                if (grade != null && grade > max) {
                    max = grade;
                }
            }
            if (max == -1) {
                System.out.println("Subject " + (j + 1) + ": No valid grades.");
            } else {
                System.out.println("Subject " + (j + 1) + ": " + max);
            }
        }

        // Overall class average
        double totalSum = 0;
        int totalCount = 0;
        for (Student student : students) {
            for (Double grade : student.getGrades()) {
                if (grade != null) {
                    totalSum += grade;
                    totalCount++;
                }
            }
        }

        System.out.println("\n=== Overall Class Average ===");
        if (totalCount == 0) {
            System.out.println("No valid grades available.");
        } else {
            System.out.println("Class Average: " + (totalSum / totalCount));
        }

        sc.close();
    }
}
