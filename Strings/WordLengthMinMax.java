package Strings;

import java.util.Scanner;
public class WordLengthMinMax {

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

    public static String[][] buildWordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            int len = getLength(words[i]);
            result[i][1] = String.valueOf(len);
        }
        return result;
    }

    public static int[] findMinMaxLengthIndexes(String[][] wordTable) {
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < wordTable.length; i++) {
            int currentLength = Integer.parseInt(wordTable[i][1]);
            int minLength = Integer.parseInt(wordTable[minIndex][1]);
            int maxLength = Integer.parseInt(wordTable[maxIndex][1]);

            if (currentLength < minLength) {
                minIndex = i;
            }
            if (currentLength > maxLength) {
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = manualSplit(input);
        String[][] wordTable = buildWordLengthTable(words);
        int[] minMax = findMinMaxLengthIndexes(wordTable);

        System.out.println("Shortest Word: " + wordTable[minMax[0]][0] + " (Length: " + wordTable[minMax[0]][1] + ")");
        System.out.println("Longest Word:  " + wordTable[minMax[1]][0] + " (Length: " + wordTable[minMax[1]][1] + ")");
        sc.close();
    }
}
