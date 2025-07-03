package Inheritance.Hierarchial_Inheritance;

// Base class
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayCommonInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass 1: Teacher
class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Teaches: " + subject);
    }
}

// Subclass 2: Student
class Student extends Person {
    String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Subclass 3: Staff
class Staff extends Person {
    String department;

    public Staff(String name, int age, String dept) {
        super(name, age);
        this.department = dept;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

// Demo class
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Roy", 40, "Mathematics");
        Student s = new Student("Ananya", 15, "10th Grade");
        Staff st = new Staff("Meena", 35, "Administration");

        t.displayCommonInfo();
        t.displayRole();
        System.out.println("----");

        s.displayCommonInfo();
        s.displayRole();
        System.out.println("----");

        st.displayCommonInfo();
        st.displayRole();
    }
}
