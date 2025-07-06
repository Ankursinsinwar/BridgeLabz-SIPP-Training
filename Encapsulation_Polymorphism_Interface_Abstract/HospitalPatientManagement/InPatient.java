package Encapsulation_Polymorphism_Interface_Abstract.HospitalPatientManagement;

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        addToHistory("InPatient: " + record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for In-Patient:");
        for (String record : getMedicalHistory()) {
            System.out.println("- " + record);
        }
    }
}
