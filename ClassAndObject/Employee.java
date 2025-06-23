package ClassAndObject;

// Class Definition
public class Employee{

    // Atributes
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails(){
         System.out.println("Employee id: " + id);
         System.out.println("Employee name: " + name);
         System.out.println("Employee salary: " + salary);

    }

    // Main method
    public static void main(String[] args) { 
 
        // Create  Employee objects 
         Employee employee1 = new  Employee("xyz", 123, 120000); 
         Employee employee2 = new  Employee("abc", 789, 150000); 
 
        // Display details of each employee 
        System.out.println("\n===  Employee 1 ==="); 
        employee1.displayDetails(); 
        System.out.println("\n===  Employee 2 ==="); 
        employee2.displayDetails(); 
    }
}