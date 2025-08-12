package Java_Regex.Advanced_Problems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Credit Card Number: ");
        String card = sc.nextLine();

        String visaRegex = "^4\\d{15}$";     // Visa: starts with 4, 16 digits
        String masterRegex = "^5\\d{15}$";   // MasterCard: starts with 5, 16 digits

        if (Pattern.matches(visaRegex, card)) {
            System.out.println("Valid Visa Card");
        } else if (Pattern.matches(masterRegex, card)) {
            System.out.println("Valid MasterCard");
        } else {
            System.out.println("Invalid Card Number");
        }

        sc.close();
    }
}
