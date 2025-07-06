package Encapsulation_Polymorphism_Interface_Abstract.HospitalPatientManagement;

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        addToHistory("OutPatient: " + record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for Out-Patient:");
        for (String record : getMedicalHistory()) {
            System.out.println("- " + record);
        }
    }
}
