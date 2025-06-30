package ObjectModeling.Company_and_Departments;

import java.util.ArrayList;
import java.util.List;

public class Department {
    
    String deptName;
    List<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    void showEmployees() {
        System.out.println(" - Department: " + deptName);
        for (Employee employee : employees) {
            employee.show();
        }
    }
}
