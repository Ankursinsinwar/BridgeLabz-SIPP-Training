package Java_Regex.Advanced_Problems;

// import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgrammingLanguageExtractor {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter text: ");
        // String text = sc.nextLine();
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        System.out.println("Text : " + text);

        String regex = "\\b(Java|Python|JavaScript|Go)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Programming languages found:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        // sc.close();
    }
}
