package ClassAndObject;

// Class Definition
public class Student {
    // Atributes
    private String name;
    private int rollNumber;
    private int marks;

    // constructor
    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    //Method to calculate grade
    public String calculateGrade() {

        if (marks >= 80){ 
            return "A";
        }
        else if (marks >= 70){
            return "B";
        }
        else if (marks >= 60){
            return "C";
        }
        else if (marks >= 50){ 
            return "D";
        }
        else if (marks >= 40){ 
            return "E";
        }
        else{ 
            return "F";
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    // Main method
    public static void main(String[] args) {

        // create student objects
        Student student1 = new Student("Ankur", 22, 88);
        Student student2 = new Student("David", 22, 90);

        System.out.println("\n=== Student 1 ===");
        student1.displayDetails();
        System.out.println("\n=== Student 1 ===");
        student2.displayDetails();
    }
}
