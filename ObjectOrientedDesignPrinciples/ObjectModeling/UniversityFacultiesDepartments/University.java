package ObjectModeling.UniversityFacultiesDepartments;

import java.util.ArrayList;
import java.util.List;

class University {
    String universityName;
    List<Department> departments;

    University(String name) {
        this.universityName = name;
        this.departments = new ArrayList<>();

    }

    Department addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }

    void showStructure() {
        System.out.println("University: " + universityName);
        for (Department d : departments) {
            d.showFacultys();
        }
    }

    public class Department {

        String deptName;
        List<Faculty> Facultys;

        Department(String deptName) {
            this.deptName = deptName;
            this.Facultys = new ArrayList<>();
        }

        void addFaculty(Faculty faculty) {
            Facultys.add(faculty);
        }

        void showFacultys() {
            System.out.println(" - Department: " + deptName);
            for (Faculty faculty : Facultys) {
                faculty.show();
            }
        }
    }

    static class Faculty {
        String name;

        Faculty(String name) {
            this.name = name;
        }

        void show() {
            System.out.println("\s - Faculty: " + name);
        }
    }

    public static void main(String[] args) {
        University university = new University("GLA University Mathura");

        Department cs = university.addDepartment("Computer Science");
        Department phisics = university.addDepartment("Phisics");
        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Prof. Santoshi");
        cs.addFaculty(f1);
        phisics.addFaculty(f2);
        

        university.showStructure();
    }
}