package Java_Regex.Advanced_Problems;


// import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyExtractor {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter text: ");
        // String text = sc.nextLine();
          String text ="The price is $45.99, and the discount is 10.50.";
        System.out.println("Text : " + text);

        String regex = "(\\$\\d+(\\.\\d{2})?|\\d+\\.\\d{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Currency values found:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        // sc.close();
    }
}
