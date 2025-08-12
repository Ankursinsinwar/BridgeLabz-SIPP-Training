package Java_Regex.Extraction_Problems;

// import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractor {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter text: ");
        // String text = sc.nextLine();
        String text = "Visit https://www.google.com and http://example.org for more info.";
        System.out.println("Text : " + text);

        String regex = "\\bhttps?://[A-Za-z0-9.-]+\\.[A-Za-z]{2,}[^\\s]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Links found:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        // sc.close();
    }
}
