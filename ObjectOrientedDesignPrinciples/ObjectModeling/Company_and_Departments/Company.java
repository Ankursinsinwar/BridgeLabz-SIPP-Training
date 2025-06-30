package ObjectModeling.Company_and_Departments;

import java.util.ArrayList;
import java.util.List;

public class Company {
    
    String companyName;
    List<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    Department addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }
    // void addDepartment(Department dept) {
    //     departments.add(dept);
    // }

    void showStructure() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }

}
