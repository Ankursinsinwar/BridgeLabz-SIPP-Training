package ObjectModeling.SchoolStudentsCourses;

public class Main {

    public static void main(String[] args) {
        Course math = new Course("Math");
        Course science = new Course("Science");

        Student s1 = new Student("Ankur");
        Student s2 = new Student("David");

        s1.enrollInCourse(math);
        s1.enrollInCourse(science);
        s2.enrollInCourse(math);

        School school = new School("K.V.S Mathura Cantt School");
        school.addStudent(s1);
        school.addStudent(s2);

        school.showStudents();
        s1.showCourses();
        s2.showCourses();
        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}
