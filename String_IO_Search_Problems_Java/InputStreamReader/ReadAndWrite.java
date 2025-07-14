// Problem: Read User Input and Write to File Using InputStreamReader
package String_IO_Search_Problems_Java.InputStreamReader;
import java.io.*;

public class ReadAndWrite {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

            String input;
            System.out.println("Enter text (type 'exit' to finish):");
            while (!(input = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(input);
                writer.newLine();
            }
            System.out.println("Input written to file 'output.txt'.");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}