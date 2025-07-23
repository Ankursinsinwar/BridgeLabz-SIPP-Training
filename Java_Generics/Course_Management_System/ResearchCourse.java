package Java_Generics.Course_Management_System;

public class ResearchCourse extends CourseType {
    ResearchCourse(String name) {
        super(name);
    }

    void display() {
        System.out.println("Research Course: " + courseName);
    }
}