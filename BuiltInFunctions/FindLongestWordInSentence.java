package BuiltInFunctions;

import java.util.Scanner;

public class FindLongestWordInSentence {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a sentence:");

        String sentence = s.nextLine();

        String[] words = sentence.split("\\s+");
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);
    }
}
