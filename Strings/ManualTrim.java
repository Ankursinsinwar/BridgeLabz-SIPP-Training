package Strings;

import java.util.Scanner;
public class ManualTrim {

    public static int[] findTrimIndexes(String text) {
        int start = 0, end;
        int len = getLength(text);

        while (start < len && text.charAt(start) == ' ') {
            start++;
        }

        end = len - 1;
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1};
    }

    public static String manualSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end && i < getLength(text); i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (getLength(s1) != getLength(s2)) return false;

        for (int i = 0; i < getLength(s1); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }

        return true;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with leading and trailing spaces: ");
        String input = sc.nextLine();

        int[] trimIndexes = findTrimIndexes(input);

        String manualTrim = manualSubstring(input, trimIndexes[0], trimIndexes[1]);

        String builtInTrim = input.trim();

        boolean match = compareStrings(manualTrim, builtInTrim);

        System.out.println("\nManual Trimmed:   [" + manualTrim + "]");
        System.out.println("Built-in Trimmed: [" + builtInTrim + "]");
        System.out.println("Do both match?    " + match);
        sc.close();
    }
}
