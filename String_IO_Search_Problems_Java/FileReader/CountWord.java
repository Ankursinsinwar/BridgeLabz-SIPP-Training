// Problem: Count the Occurrence of a Word in a File Using FileReader
package String_IO_Search_Problems_Java.FileReader;
import java.io.*;

public class CountWord {
    public static void main(String[] args) {
        String wordToFind = "java";
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (String word : line.split("\s+")) {
                    if (word.equalsIgnoreCase(wordToFind)) {
                        count++;
                    }
                }
            }
            System.out.println("The word '" + wordToFind + "' occurs " + count + " times.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}