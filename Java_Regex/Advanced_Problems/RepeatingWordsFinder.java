package Java_Regex.Advanced_Problems;

// import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWordsFinder {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter text: ");
        // String text = sc.nextLine();
          String text ="This is is a repeated repeated word test.";
        System.out.println("Text : " + text);

        String regex = "\\b(\\w+)\\b\\s+\\1\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Repeating words:");
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }

        // sc.close();
    }
}
