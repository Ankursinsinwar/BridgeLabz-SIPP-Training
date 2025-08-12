package Java_Regex.Replace_Modify_Strings;

// import java.util.Scanner;
import java.util.regex.Pattern;

public class CensorBadWords {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter sentence: ");
        // String sentence = sc.nextLine();
        String sentence = "\"This is a damn bad example with some stupid words.";
        System.out.println("sentence : " + sentence);

        // List of bad words (add more if needed)
        String[] badWords = {"damn", "stupid"};

        for (String word : badWords) {
            String regex = "(?i)\\b" + Pattern.quote(word) + "\\b"; // (?i) = case-insensitive
            sentence = sentence.replaceAll(regex, "****");
        }

        System.out.println("Censored: " + sentence);

        // sc.close();
    }
}
