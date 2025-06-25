package InstanceVSClassVariablesAndMethods;

public class Course {
    String courseName;
    int duration; // in weeks
    double fee;
    static String instituteName = " Unacademy";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: Rs. " + fee + ", Institute: " + instituteName);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("NDA", 6, 3000.0);
        Course c2 = new Course("CDS", 4, 2500.0);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("Phisics Wala");

        System.out.println("--- After Updating Institute Name ---");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
