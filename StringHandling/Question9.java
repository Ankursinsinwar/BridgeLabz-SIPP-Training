package StringHandling;

import java.util.*;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[256];
        for (char c : str.toCharArray())
            freq[c]++;
        int max = 0;
        char ch = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                ch = c;
            }
        }
        System.out.println(ch);
        sc.close();
    }
}
