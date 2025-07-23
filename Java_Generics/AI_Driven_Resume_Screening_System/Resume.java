package Java_Generics.AI_Driven_Resume_Screening_System;

import java.util.List;

class Resume<T extends JobRole> {
    private T role;

    Resume(T role) {
        this.role = role;
    }

    void process() {
        System.out.print("Processing Resume for: ");
        role.showRole();
    }

    static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole r : resumes) {
            r.showRole();
        }
    }
}