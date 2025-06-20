package Methods;

import java.util.Scanner;
public class LeapYearChecker {

    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
            sc.close();
            return;
        }
        
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        }
        else {
            System.out.println(year + " is not a Leap Year.");
        }
        sc.close();
    }
}