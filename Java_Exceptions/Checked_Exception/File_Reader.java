package Java_Exceptions.Checked_Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {
    public static void main(String[] args) {
        try 
        {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
             String line;
            while ((line = br.readLine()) != null) System.out.println(line);
            br.close();
        } 
        catch (IOException e) 
        {
             System.out.println("File not found");
        }
    }
}