package BuiltInFunctions;

import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a string:");

        String input = s.nextLine();
        System.out.println("Enter the character to remove:");
        
        char chToRemove = s.nextLine().charAt(0);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != chToRemove) {
                result.append(input.charAt(i));
            }
        }

        System.out.println("Modified String: " + result.toString());
    }
}
