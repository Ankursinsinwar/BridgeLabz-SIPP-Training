package Java_Regex.Extraction_Problems;

// import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWordsExtractor {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter text: ");
        // String text = sc.nextLine();
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        System.out.println("Text : " + text);

        String regex = "\\b[A-Z][a-zA-Z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Capitalized words:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        // sc.close();
    }
}
