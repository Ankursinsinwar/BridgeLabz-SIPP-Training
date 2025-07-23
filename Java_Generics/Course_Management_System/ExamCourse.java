package Java_Generics.Course_Management_System;

public class ExamCourse extends CourseType {
    ExamCourse(String name) {
        super(name);
    }

    void display() {
        System.out.println("Exam Course: " + courseName);
    }
}
