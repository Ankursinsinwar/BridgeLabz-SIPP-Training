package Strings;

import java.util.Scanner;
public class Illegal_Argument_Exception {

    public static void generateException(String input) {
        String result = input.substring(5, 2);
        System.out.println("Substring result: " + result);
    }

    public static void handleException(String input) {
        try {
            String result = input.substring(5, 2);
            System.out.println("Handled substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Generating Exception: ");
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Handling Exception: ");
        handleException(input);

        sc.close();
    }
}
