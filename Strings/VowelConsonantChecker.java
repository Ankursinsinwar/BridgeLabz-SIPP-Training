package Strings;

import java.util.Scanner;
public class VowelConsonantChecker {

    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] analyzeString(String input) {
        int length = input.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
    }

    public static void displayResult(String[][] array) {
        System.out.printf("%-10s | %-15s\n", "Character", "Type");
        System.out.println("-----------------------------");
        for (String[] row : array) {
            System.out.printf("%-10s | %-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] analysis = analyzeString(input);
        displayResult(analysis);
	sc.close();
    }
}
