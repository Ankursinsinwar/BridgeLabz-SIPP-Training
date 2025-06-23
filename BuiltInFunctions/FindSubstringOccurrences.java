package BuiltInFunctions;

import java.util.Scanner;

public class FindSubstringOccurrences {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the main string:");

        String mainString = s.nextLine();
        System.out.println("Enter the substring to find:");
        
        String subString = s.nextLine();

        int count = 0;
        int index = 0;
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }

        System.out.println("Number of occurrences: " + count);
    }
}
