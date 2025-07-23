package Java_Generics.Course_Management_System;

class AssignmentCourse extends CourseType {
    AssignmentCourse(String name) {
        super(name);
    }

    void display() {
        System.out.println("Assignment Course: " + courseName);
    }
}