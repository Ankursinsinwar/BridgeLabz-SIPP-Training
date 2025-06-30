package ObjectModeling.SchoolStudentsCourses;

import java.util.ArrayList;
import java.util.List;

class School {
    String schoolName;
    List<Student> students = new ArrayList<>();

    School(String name) {
        this.schoolName = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Students in " + schoolName);
        for (Student s : students) {
            System.out.println(" - " + s.name);
        }
    }
}