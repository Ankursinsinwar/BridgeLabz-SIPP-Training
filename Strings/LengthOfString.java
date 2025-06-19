package Strings;

import java.util.Scanner;
public class LengthOfString {

    public static int getLength(String text) {
        int count = 0;

        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Use user-defined method
        int manualLength = getLength(input);

        // Use built-in method
        int builtInLength = input.length();

        // Display both
        System.out.println("\nManual Length:   " + manualLength);
        System.out.println("Built-in Length: " + builtInLength);

        sc.close();
    }
}
