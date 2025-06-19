package Strings;

import java.util.Scanner;

public class ArrayIndex_OutOfBounds_Exception {

    public static void generateException(String[] names) {
        System.out.println("Accessing index (out of bounds): " + names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing index " + names.length + ": " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int len = sc.nextInt();
        sc.nextLine();

        String[] names = new String[len];

        System.out.println("Enter names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ", ");
        }
        
        System.out.println("Generating Exception: ");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Handling Exception: ");
        handleException(names);

        sc.close();
    }
}
