package Strings;

import java.util.Scanner;

public class VowelConsonantCount {


    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static int[] countString(String input) {
        int length = input.length();
        int[] result = new int[3];

        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if (checkCharacterType(ch) == "Vowel") {
                result[0]++;
            }else if (checkCharacterType(ch) == "Consonant") {
                result[1]++;
            }else{
                result[2]++;
            }
        }
        return result;
    }

      

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] counts = countString(input);

        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
        System.out.println("Number of non leter: " + counts[2]);
        
        

        sc.close();
    }

}
