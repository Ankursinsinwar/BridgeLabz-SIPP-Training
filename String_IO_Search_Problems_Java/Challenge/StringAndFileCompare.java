// Challenge Problem: Compare StringBuilder, StringBuffer, FileReader, and InputStreamReader
package String_IO_Search_Problems_Java.Challenge;
import java.io.*;

public class StringAndFileCompare {
    public static void main(String[] args) {
        int n = 1000000;

        // Measure StringBuilder time
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("hello");
        long end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start) + " ns");

        // Measure StringBuffer time
        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) sbf.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start) + " ns");

        // FileReader for word count
        try (BufferedReader fr = new BufferedReader(new FileReader("sample.txt"))) {
            int words = 0;
            String line;
            while ((line = fr.readLine()) != null) {
                words += line.split("\s+").length;
            }
            System.out.println("Word count using FileReader: " + words);
        } catch (IOException e) {
            System.out.println("FileReader error.");
        }

        // InputStreamReader for word count
        try (BufferedReader ir = new BufferedReader(new InputStreamReader(new FileInputStream("sample.txt")))) {
            int words = 0;
            String line;
            while ((line = ir.readLine()) != null) {
                words += line.split("\s+").length;
            }
            System.out.println("Word count using InputStreamReader: " + words);
        } catch (IOException e) {
            System.out.println("InputStreamReader error.");
        }
    }
}