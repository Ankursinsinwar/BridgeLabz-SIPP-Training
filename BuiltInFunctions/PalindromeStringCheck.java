package BuiltInFunctions;

import java.util.Scanner;

public class PalindromeStringCheck {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = s.nextLine();

        String lower = input.toLowerCase();
        boolean isPalindrome = true;
        int len = lower.length();

        for (int i = 0; i < len / 2; i++) {
            if (lower.charAt(i) != lower.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } 
        else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
