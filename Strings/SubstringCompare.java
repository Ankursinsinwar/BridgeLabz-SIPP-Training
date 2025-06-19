package Strings;

import java.util.Scanner;

public class SubstringCompare {

    public static String manualSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end && i < text.length(); i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        if (start < 0 || end > input.length() || start > end) {
            System.out.println("Start should be >= 0, End <= string length, and Start <= End.");
            sc.close();
            return;
        }

        String manualSub = manualSubstring(input, start, end);
        String builtInSub = input.substring(start, end);

        boolean areEqual = compareStrings(manualSub, builtInSub);

        System.out.println("Manual Substring:   " + manualSub);
        System.out.println("Built-in Substring: " + builtInSub);
        System.out.println("Are both substrings equal? " + areEqual);
        sc.close();
    }
}
