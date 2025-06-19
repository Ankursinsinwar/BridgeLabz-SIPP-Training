package Strings;


import java.util.Scanner;
public class Number_Format_Exception {

    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number (handled): " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (or invalid text to test): ");
        String input = sc.nextLine();

        System.out.println("\n=== Generating Uncaught Exception ===");
        try {
            generateException(input); // may throw and crash if not handled
        } catch (NumberFormatException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        System.out.println("\n=== Handling Exception Gracefully ===");
        handleException(input);

        sc.close();
    }
}
