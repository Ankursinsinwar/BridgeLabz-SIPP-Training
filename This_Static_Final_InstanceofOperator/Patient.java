package This_Static_Final_InstanceofOperator;

// class Definition
public class Patient {
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    static String hospitalName = "KD Hospital";
    static int totalPatients = 0;

    // Constructor
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Static method
    public static void getTotalPatients() {
        System.out.println("\nTotal Admitted Patients: " + totalPatients);
    }

    // Instance method using instanceof
    public void displayPatientDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println("\nPatient ID: " + p.patientID);
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
            System.out.println("Hospital: " + hospitalName);
        } else {
            System.out.println("Invalid Patient object.");
        }
    }

    // main method
    public static void main(String[] args) {
        // create objects of Patient
        Patient p1 = new Patient(301, "Rajeev", 45, "Fever");
        Patient p2 = new Patient(302, "Meena", 30, "Flu");

        p1.displayPatientDetails(p1);
        p2.displayPatientDetails(p2);

        //Display total number of Patients
        getTotalPatients();
    }
}
