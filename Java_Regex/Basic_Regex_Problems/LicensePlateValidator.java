package Java_Regex.Basic_Regex_Problems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LicensePlateValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter License Plate Number : ");
        String plate = sc.nextLine();

        String regex = "^[A-Z]{2}\\d{4}$";
        Pattern pattern = Pattern.compile(regex);

        if (pattern.matcher(plate).matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}
