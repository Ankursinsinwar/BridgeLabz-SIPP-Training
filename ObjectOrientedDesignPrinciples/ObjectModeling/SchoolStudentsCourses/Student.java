package ObjectModeling.SchoolStudentsCourses;

import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this); // bi-directional
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println(" - " + c.courseName);
        }
    }
}