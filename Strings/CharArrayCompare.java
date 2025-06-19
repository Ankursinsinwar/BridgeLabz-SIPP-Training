package Strings;

import java.util.Scanner;
public class CharArrayCompare {

    public static char[] manualToCharArray(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] manualArray = manualToCharArray(input);
        char[] builtInArray = input.toCharArray();

        boolean isEqual = compareCharArrays(manualArray, builtInArray);

        System.out.print("Manual char array: ");
        for (char c : manualArray) System.out.print(c + " ");

        System.out.print("\nBuilt-in char array: ");
        for (char c : builtInArray) System.out.print(c + " ");

        System.out.println("\nAre both char arrays equal? " + isEqual);
        
        sc.close();
    }
}
