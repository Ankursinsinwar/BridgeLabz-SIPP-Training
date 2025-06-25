package AccessModifiers;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public void showInfo() {
        System.out.println("Employee ID (public): " + employeeID);
        System.out.println("Department (protected): " + department);
    }

    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.employeeID = 501;
        mgr.department = "Engineering";
        mgr.setSalary(85000.0);

        mgr.showInfo();
        System.out.println("Salary (private via getter): ₹" + mgr.getSalary());
    }
}
