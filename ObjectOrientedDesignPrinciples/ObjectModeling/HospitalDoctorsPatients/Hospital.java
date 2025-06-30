package ObjectModeling.HospitalDoctorsPatients;

import java.util.ArrayList;
import java.util.List;

class Hospital {
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(Patient p) {
        patients.add(p);
    }

    static class Doctor {
        String name;

        Doctor(String name) {
            this.name = name;
        }

        void consult(Patient p) {
            System.out.println("Doctor " + name + " is consulting patient " + p.name);
        }
    }

    static class Patient {
        String name;

        Patient(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Hospital h = new Hospital();

        Doctor d1 = new Doctor("Dr. Meena");
        Doctor d2 = new Doctor("Dr. Raj");

        Patient p1 = new Patient("Ravi");
        Patient p2 = new Patient("Asha");

        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);

        d1.consult(p1);
        d2.consult(p1);
        d1.consult(p2);
        d2.consult(p2);
    }
}
