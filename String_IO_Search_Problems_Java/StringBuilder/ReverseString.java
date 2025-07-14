// Problem: Reverse a String Using StringBuilder
package String_IO_Search_Problems_Java.StringBuilder;
public class ReverseString {
    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Reversed String: " + reverse(input));
    }
}