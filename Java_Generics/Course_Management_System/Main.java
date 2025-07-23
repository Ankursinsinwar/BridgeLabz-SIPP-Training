package Java_Generics.Course_Management_System;

public class Main {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourse = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        examCourses.addCourse(new ExamCourse("OOPs"));
        assignmentCourse.addCourse(new AssignmentCourse("DSA"));
        researchCourses.addCourse(new ResearchCourse("Generics"));

        System.out.println("\nExam-Based Courses:");
        Course.printCourses(examCourses.getCourses());

        System.out.println("\nAssignment-Based Courses:");
        Course.printCourses(assignmentCourse.getCourses());

        System.out.println("\nResearch-Based Courses:");
        Course.printCourses(researchCourses.getCourses());
    }
}
