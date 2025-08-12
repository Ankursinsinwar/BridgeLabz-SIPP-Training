package Java_Regex.Basic_Regex_Problems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HexColorValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hex Color Code : ");
        String color = sc.nextLine();

        String regex = "^#[0-9A-Fa-f]{6}$";
        Pattern pattern = Pattern.compile(regex);

        if (pattern.matcher(color).matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}
