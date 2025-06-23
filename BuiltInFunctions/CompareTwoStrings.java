package BuiltInFunctions;

import java.util.Scanner;

public class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter String 1:");

        String str1 = s.nextLine();
        System.out.println("Enter String 2:");

        String str2 = s.nextLine();

        int len1 = str1.length();
        int len2 = str2.length();

        int minLen = Math.min(len1, len2);
        int result = 0;

        for (int i = 0; i < minLen; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result = str1.charAt(i) - str2.charAt(i);
                break;
            }
        }

        if (result == 0) {
            if (len1 == len2) {
                System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
            } 
            else if (len1 < len2) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
            } 
            else {
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
            }
        } 
        else if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } 
        else {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
        }
    }
}
