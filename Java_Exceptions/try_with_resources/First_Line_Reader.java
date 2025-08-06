package Java_Exceptions.try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class First_Line_Reader {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt")))
        {
             System.out.println(br.readLine());
        } 
        catch (IOException e) 
        {
             System.out.println("Error reading file");
        }
    }
}
