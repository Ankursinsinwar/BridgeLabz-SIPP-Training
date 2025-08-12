package Java_Regex.Advanced_Problems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IPAddressValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IPv4 Address: ");
        String ip = sc.nextLine();

        // Each octet: 0-255
        String regex = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}"
                     + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

        Pattern pattern = Pattern.compile(regex);

        if (pattern.matcher(ip).matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}
