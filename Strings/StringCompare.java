package Strings;

import java.util.Scanner;

public class StringCompare {


    public static boolean compareUsingCharAt(String string1, String string2) {

        if (string1.length() != string2.length()) {
            return false;
        }

        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String string1 = sc.next();

        System.out.print("Enter second string: ");
        String string2 = sc.next();

        boolean charAtResult = compareUsingCharAt(string1, string2);

        // Compare using equals()
        boolean equalsResult = string1.equals(string2);
        
        if (charAtResult == equalsResult) {
            System.out.println("Both methods returned the same result.");
        } else {
            System.out.println("The results are different between the two methods.");
        }

        System.out.println("\nComparison using charAt(): " + charAtResult);
        System.out.println("Comparison using equals(): " + equalsResult);
        sc.close();
    }
}
