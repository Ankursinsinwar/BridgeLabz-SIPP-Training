package Strings;

import java.util.Scanner;
public class TextToLowerCace {

    public static String convertToLowerCase(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result.append(ch);
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
         
        System.out.print("Enter string: ");
        String text= sc.nextLine();

        String manualLower = convertToLowerCase(text);

        String builtInLower = text.toLowerCase();

        boolean areEqual = compareStrings(manualLower, builtInLower);

        System.out.println("Manual Lowercase:   " + manualLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Are both results equal? " + areEqual);

        sc.close();
    }
}
