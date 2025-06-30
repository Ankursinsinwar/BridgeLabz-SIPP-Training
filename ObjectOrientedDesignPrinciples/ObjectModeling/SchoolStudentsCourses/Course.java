package ObjectModeling.SchoolStudentsCourses;

import java.util.ArrayList;
import java.util.List;

class Course {
    String courseName;
    List<Student> enrolledStudents = new ArrayList<>();

    Course(String name) {
        this.courseName = name;
    }

    void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    void showEnrolledStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : enrolledStudents) {
            System.out.println(" - " + s.name);
        }
    }
}