package Java_Generics.Course_Management_System;

import java.util.ArrayList;
import java.util.List;

class Course<T extends CourseType> {
    List<T> courses = new ArrayList<>();

    void addCourse(T course) {
        courses.add(course);
    }

    List<T> getCourses() {
        return courses;
    }

    // using wildcard to handle any type of course dynamically.
    static void printCourses(List<? extends CourseType> list) {
        for (CourseType course : list) {
            course.display();
        }
    }
}