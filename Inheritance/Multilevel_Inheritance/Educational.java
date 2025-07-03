package Inheritance.Multilevel_Inheritance;

// Base class
class Course {
    String courseName;
    int duration; // in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " hours");
    }
}

// First-level subclass
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Second-level subclass
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // in %

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: ₹" + fee + ", Discount: " + discount + "%");
    }
}

// Demo class
public class Educational  {
    public static void main(String[] args) {
        Course basic = new Course("C Programming", 30);
        OnlineCourse online = new OnlineCourse("Java Full Stack", 60, "Udemy", true);
        PaidOnlineCourse paid = new PaidOnlineCourse("Python AI", 90, "Coursera", true, 3999.0, 15.0);

        basic.displayInfo();
        System.out.println("------");
        online.displayInfo();
        System.out.println("------");
        paid.displayInfo();
    }
}
