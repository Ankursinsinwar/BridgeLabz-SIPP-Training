package Java_Regex.Replace_Modify_Strings;

// import java.util.Scanner;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter text: ");
        // String text = sc.nextLine();
        String text = "This is   an example     with multiple     spaces.";
        System.out.println("Text : " + text);

        // Replace 2 or more spaces with a single space
        String result = text.replaceAll("\\s{2,}", " ");

        System.out.println("Result: " + result);

        // sc.close();
    }
}
