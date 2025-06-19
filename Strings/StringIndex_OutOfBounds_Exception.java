package Strings;

import java.util.Scanner;

public class StringIndex_OutOfBounds_Exception {

    public static void generateException(String input) {
        char ch = input.charAt(input.length());
        System.out.println("Character at invalid index: " + ch);
    }

    public static void handleException(String input) {
        try {
            char ch = input.charAt(input.length());
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
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
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Handling Exception: ");
        handleException(input);
    
        sc.close();
    }
}
