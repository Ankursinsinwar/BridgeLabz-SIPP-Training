package BuiltInFunctions;

import java.util.Scanner;

public class ToggleCaseOfCharacters {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a string:");

        String input = s.nextLine();

        StringBuilder toggled = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } 
            else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } 
            else {
                toggled.append(ch);
            }
        }

        System.out.println("Toggled case string: " + toggled.toString());
    }
}
