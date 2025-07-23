package Java_Generics.Course_Management_System;

abstract class CourseType {
    String courseName;

    CourseType(String name) {
        this.courseName = name;
    }

    abstract void display();
}