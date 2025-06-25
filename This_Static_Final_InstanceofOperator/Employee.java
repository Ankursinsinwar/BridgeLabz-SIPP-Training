package This_Static_Final_InstanceofOperator;

// class Definition
public class Employee {
    private final int id;
    private String name;
    private String designation;

    static String companyName = "Tech Solutions Ltd.";
    static int totalEmployees = 0;

    // Constructor
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method
    public static void displayTotalEmployees() {
        System.out.println("\nTotal Employees: " + totalEmployees);
    }

    // Instance method using instanceof
    public void displayEmployeeDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            System.out.println("\nID: " + e.id);
            System.out.println("Name: " + e.name);
            System.out.println("Designation: " + e.designation);
            System.out.println("Company: " + companyName);
        } else {
            System.out.println("Invalid Employee object.");
        }
    }

    // main method
    public static void main(String[] args) {
        // create objects of Employee
        Employee e1 = new Employee(101, "Ankur", "Manager");
        Employee e2 = new Employee(102, "David", "Developer");

        e1.displayEmployeeDetails(e1);
        e2.displayEmployeeDetails(e2);

        // Display total number of employees
        displayTotalEmployees();
    }
}
