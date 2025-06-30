package ObjectModeling.Company_and_Departments;

public class Main {

    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department dev = company.addDepartment("Development");
        dev.addEmployee("Ankur");
        dev.addEmployee("David");
        
        Department hr = company.addDepartment("Human Resources");
        hr.addEmployee("Dalla");

        company.showStructure();
    }
}
