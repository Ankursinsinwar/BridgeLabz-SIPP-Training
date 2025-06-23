package BuiltInFunctions;

import java.util.Scanner;

public class FindMostFrequentCharacter {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a string:");

        String input = s.nextLine();

        int[] freq = new int[256]; // ASCII
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }

        int maxFreq = 0;
        char mostFrequent = '\0';
        
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostFrequent = (char) i;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
