package ObjectModeling.Company_and_Departments;

public class Employee {

     String name;

    Employee(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(" \s - Employee: " + name);
    }
}
