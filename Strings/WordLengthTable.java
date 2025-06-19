package Strings;

import java.util.Scanner;
public class WordLengthTable {

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static String[] manualSplit(String text) {
        int length = getLength(text);
        int wordCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }
        wordCount++;

        String[] words = new String[wordCount];
        StringBuilder word = new StringBuilder();
        int index = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                words[index++] = word.toString();
                word.setLength(0); 
            } else {
                word.append(ch);
            }
        }

        words[index] = word.toString();
        return words;
    }

    public static String[][] buildWordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            int wordLength = getLength(words[i]);
            result[i][1] = String.valueOf(wordLength);
        }

        return result;
    }

    public static void displayTable(String[][] wordData) {
        System.out.printf("%-15s | %-6s\n", "Word", "Length");
        System.out.println("----------------------------");

        for (String[] row : wordData) {
            String word = row[0];
            int length = Integer.parseInt(row[1]); // convert string to int
            System.out.printf("%-15s | %-6d\n", word, length);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = manualSplit(input);
        String[][] wordTable = buildWordLengthTable(words);

        displayTable(wordTable);

        sc.close();
    }
}
