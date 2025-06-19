package Strings;

import java.util.Scanner;
public class SplitCompare {

    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
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
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++;

        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                words[wordIndex++] = word.toString();
                word.setLength(0);
            } else {
                word.append(ch);
            }
        }

        words[wordIndex] = word.toString();
        return words;
    }

    public static boolean compareStringArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void displayWords(String[] arr, String label) {
        System.out.println(label + ":");
        for (String word : arr) {
            System.out.println(" - " + word);
        }
    }

    // Step 5: Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input full sentence
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] manualSplit = manualSplit(input);
        
        String[] builtInSplit = input.split(" ");

        displayWords(manualSplit, "Manual Split");
        displayWords(builtInSplit, "Built-in Split");

        boolean match = compareStringArrays(manualSplit, builtInSplit);
        System.out.println("Do both split methods produce the same result? " + match);
        sc.close();
    }
}
