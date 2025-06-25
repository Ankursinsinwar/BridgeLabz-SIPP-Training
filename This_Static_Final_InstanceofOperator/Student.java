package This_Static_Final_InstanceofOperator;

// class Definition
public class Student {
    private final long rollNumber;
    private String name;
    private char grade;

    static String universityName = "GLA University";
    static int totalStudents = 0;

    // Constructor
    public Student(long rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    // Static method
    public static void displayTotalStudents() {
        System.out.println("\nTotal Students Enrolled: " + totalStudents);
    }

    // Instance method using instanceof
    public void displayStudentDetails(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("\nRoll No: " + s.rollNumber);
            System.out.println("Name: " + s.name);
            System.out.println("Grade: " + s.grade);
            System.out.println("University: " + universityName);
        } else {
            System.out.println("Invalid Student object.");
        }
    }

    // main method
    public static void main(String[] args) {
        // create objects of Student
        Student s1 = new Student(2215000273L, "Ankur", 'A');
        Student s2 = new Student(2215005427L, "David", 'A');

        s1.displayStudentDetails(s1);
        s2.displayStudentDetails(s2);

        // Display total number of students
        displayTotalStudents();
    }
}
