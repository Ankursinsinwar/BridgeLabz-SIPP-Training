package LinkedListProblems;

// Node class for Student
class Student {
    int rollNumber;
    String name;
    int age;
    String grade;
    Student next;

    public Student(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

// Linked List implementation for student management
class StudentLinkedList {
    private Student head;

    // Add at beginning
    public void addAtBeginning(int roll, String name, int age, String grade) {
        Student newStudent = new Student(roll, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    // Add at end
    public void addAtEnd(int roll, String name, int age, String grade) {
        Student newStudent = new Student(roll, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newStudent;
    }

    // Add at specific position
    public void addAtPosition(int position, int roll, String name, int age, String grade) {
        if (position <= 1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }

        Student newStudent = new Student(roll, name, age, grade);
        Student current = head;
        for (int i = 1; current != null && i < position - 1; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newStudent.next = current.next;
        current.next = newStudent;
    }

    // Delete by Roll Number
    public void deleteByRollNumber(int roll) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNumber == roll) {
            head = head.next;
            return;
        }

        Student current = head;
        while (current.next != null && current.next.rollNumber != roll) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Roll number not found.");
            return;
        }

        current.next = current.next.next;
    }

    // Search by Roll Number
    public void searchByRollNumber(int roll) {
        Student current = head;
        while (current != null) {
            if (current.rollNumber == roll) {
                System.out.println("Student Found:");
                printStudent(current);
                return;
            }
            current = current.next;
        }
        System.out.println("Student not found.");
    }

    // Update grade by Roll Number
    public void updateGrade(int roll, String newGrade) {
        Student current = head;
        while (current != null) {
            if (current.rollNumber == roll) {
                current.grade = newGrade;
                System.out.println("Grade updated.");
                return;
            }
            current = current.next;
        }
        System.out.println("Student not found.");
    }

    // Display all records
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records.");
            return;
        }
        Student current = head;
        System.out.print("[Head]");
        while (current != null) {
            printStudent(current);
            current = current.next;
            System.out.print("-->");
        }
        System.out.println(" null");
    }

    // Helper to print a student
    private void printStudent(Student s) {
        System.out.print(" [Roll No: " + s.rollNumber + " | Name: " + s.name + " | Age: " + s.age + " | Grade: " + s.grade + "] ");
    }
}

// Main class to run the program
public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        // Sample operations
        list.addAtEnd(1, "Ankur", 20, "A");
        list.addAtBeginning(2, "David", 21, "B");
        list.addAtPosition(2, 3, "Tarun", 19, "C");

        list.displayAll();

        System.out.println("\nSearching for Roll No 3:");
        list.searchByRollNumber(3);

        System.out.println("\nUpdating grade for Roll No 3:");
        list.updateGrade(3, "A+");

        System.out.println("\nDeleting Roll No 2:");
        list.deleteByRollNumber(2);

        System.out.println("\nFinal Student Records:");
        list.displayAll();
    }
}
