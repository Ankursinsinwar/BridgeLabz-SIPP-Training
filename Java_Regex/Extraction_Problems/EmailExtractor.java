package Java_Regex.Extraction_Problems;

// import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter text: ");
        // String text = sc.nextLine();
        String text = "Contact us at support@example.com and info@company.org";
        System.out.println("Text : " + text);

        String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Emails found:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        // sc.close();
    }
}
