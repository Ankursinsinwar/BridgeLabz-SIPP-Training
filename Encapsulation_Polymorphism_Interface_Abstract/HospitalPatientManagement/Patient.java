package Encapsulation_Polymorphism_Interface_Abstract.HospitalPatientManagement;

import java.util.ArrayList;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private ArrayList<String> medicalHistory = new ArrayList<>(); // Encapsulated

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters (Encapsulation)
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    protected void addToHistory(String record) {
        medicalHistory.add(record);
    }

    protected ArrayList<String> getMedicalHistory() {
        return new ArrayList<>(medicalHistory); // return copy to preserve encapsulation
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Bill Amount: Rs. " + calculateBill());
    }
}
