package Encapsulation_Polymorphism_Interface_Abstract.EmployeeManagementSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee fullTime_Employee = new FullTimeEmployee(1, "Ankur", 60000, 5000);
        fullTime_Employee.assignDepartment("Manager");

        PartTimeEmployee partTime_Employee = new PartTimeEmployee(2, "Tushar", 15000, 20, 300);
        partTime_Employee.assignDepartment("Intern");

        employees.add(fullTime_Employee);
        employees.add(partTime_Employee);

        // Polymorphic behavior
        for (Employee emp : employees) {
            emp.displayDetails();

            // Downcasting to access department details
            if (emp instanceof Department) {
                Department dept = (Department) emp;
                System.out.println(dept.getDepartmentDetails());
            }

            System.out.println("---------------------------");
        }
    }
}
