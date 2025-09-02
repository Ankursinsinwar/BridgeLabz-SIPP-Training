package Lambda_Expressions.Hospital_Patient_ID_Printing;

import java.util.Arrays;
import java.util.List;

public class PatientIDs {
    public static void main(String[] args) {
        List<String> patientIds = Arrays.asList("P1001", "P1002", "P1003");

        // Using method reference instead of lambda
        patientIds.forEach(System.out::println);
    }
}

