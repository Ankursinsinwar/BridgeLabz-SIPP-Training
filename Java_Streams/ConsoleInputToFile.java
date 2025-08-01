package Java_Streams;

import java.io.*;

public class ConsoleInputToFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("user_info.txt")) {

            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            fw.write("Name: " + name + "\nAge: " + age + "\nLanguage: " + language);

            System.out.println("Information saved successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
