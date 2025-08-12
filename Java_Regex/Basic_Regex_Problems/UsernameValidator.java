package Java_Regex.Basic_Regex_Problems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username : ");
        String username = sc.nextLine();

        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);

        if (pattern.matcher(username).matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}
