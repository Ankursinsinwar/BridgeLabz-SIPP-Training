package Java_Regex.Advanced_Problems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SSNValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter SSN: ");
        String ssn = sc.nextLine();

        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);

        if (pattern.matcher(ssn).matches()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        sc.close();
    }
}
