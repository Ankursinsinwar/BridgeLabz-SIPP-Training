// Problem: Concatenate Strings Efficiently Using StringBuffer
package String_IO_Search_Problems_Java.StringBuffer;
public class ConcatenateStrings {
    public static String concatenate(String[] strings) {
        StringBuffer sb = new StringBuffer();
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] array = {"Java", " ", "is", " ", "fun!"};
        System.out.println("Concatenated String: " + concatenate(array));
    }
}