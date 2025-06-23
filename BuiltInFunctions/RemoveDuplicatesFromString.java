package BuiltInFunctions;

import java.util.Scanner;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a string:");
        
        String input = s.nextLine();

        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // ASCII

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }

        System.out.println("String after removing duplicates: " + result.toString());
    }
}
