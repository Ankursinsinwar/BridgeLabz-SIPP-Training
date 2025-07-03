package Inheritance.Inheritance ;

// Base class
class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.print("Name: " + name + ", ID: " + id + ", Salary: Rs. " + salary);
    }
}

// Manager subclass
class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        System.out.print("Manager : ");
        super.displayDetails();
        System.out.println(", Team Size: " + teamSize + "\n");
    }
}

// Developer subclass
class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String lang) {
        super(name, id, salary);
        this.programmingLanguage = lang;
    }

    @Override
    public void displayDetails() {
        System.out.print("Devloper : ");
        super.displayDetails();
        System.out.println(", Programming Language: " + programmingLanguage + "\n");
    }
}

// Intern subclass
class Intern extends Employee {
    int durationMonths;

    public Intern(String name, int id, double salary, int months) {
        super(name, id, salary);
        this.durationMonths = months;
    }

    @Override
    public void displayDetails() {
        System.out.print("Intern : ");
        super.displayDetails();
        System.out.println(", Internship Duration: " + durationMonths + " months" + "\n");
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee e1 = new Manager("Ankur", 101, 85000, 5);
        Employee e2 = new Developer("David", 102, 75000, "Python");
        Employee e3 = new Intern("kartik", 103, 15000, 6);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
