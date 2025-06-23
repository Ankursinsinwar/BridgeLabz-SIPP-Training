package BuiltInFunctions;

import java.util.Scanner;

public class ReplaceWordInSentence {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a sentence:");

        String sentence = s.nextLine();
        System.out.println("Enter the word to replace:");

        String oldWord = s.nextLine();
        System.out.println("Enter the replacement word:");

        String newWord = s.nextLine();

        String replacedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified sentence: " + replacedSentence);
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                result.append(newWord);
            } 
            else {
                result.append(words[i]);
            }
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
