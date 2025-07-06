package Encapsulation_Polymorphism_Interface_Abstract.HospitalPatientManagement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<>();

        InPatient p1 = new InPatient("IP101", "Ankur", 45, 5, 2000);
        OutPatient p2 = new OutPatient("OP202", "David", 30, 500);

        p1.addRecord("Admitted for surgery");
        p1.addRecord("Prescribed antibiotics");

        p2.addRecord("General consultation");
        p2.addRecord("Routine check-up");

        patients.add(p1);
        patients.add(p2);

        System.out.println("----- Patient Billing Summary -----");
        for (Patient patient : patients) {
            patient.getPatientDetails();
            if (patient instanceof MedicalRecord) {
                ((MedicalRecord) patient).viewRecords();
            }
            System.out.println("-----------------------------------");
        }
    }
}
