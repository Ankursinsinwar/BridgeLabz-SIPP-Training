package Java_Generics.AI_Driven_Resume_Screening_System;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = new Resume<>(new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>(new DataScientist());

        r1.process();
        r2.process();

        List<JobRole> list = new ArrayList<>();
        list.add(new SoftwareEngineer());
        list.add(new ProductManager());

        System.out.println("\nScreening Pipeline:");
        Resume.processResumes(list);
    }
}
