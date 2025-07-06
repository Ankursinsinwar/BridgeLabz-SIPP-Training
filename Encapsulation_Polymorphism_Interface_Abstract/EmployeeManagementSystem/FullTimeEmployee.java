package Encapsulation_Polymorphism_Interface_Abstract.EmployeeManagementSystem;

class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double fixedBonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedBonus) {
        super(employeeId, name, baseSalary);
        this.fixedBonus = fixedBonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedBonus;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}
