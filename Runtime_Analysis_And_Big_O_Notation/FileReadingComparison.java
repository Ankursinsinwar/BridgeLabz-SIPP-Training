package Runtime_Analysis_And_Big_O_Notation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadingComparison {

    public static void main(String[] args) throws IOException {
        String filePath = "Runtime_Analysis_And_Big_O_Notation\\largefile.txt";
        long start, end;

        start = System.nanoTime();
        // Test with FileReader (Character Stream)
        // try (FileReader fr = new FileReader(filePath)) {
        //     while (fr.read() != -1) {
        //         // Reading character by character
        //     }
        // }

        // Buffered FileReader To make approaches more realistic and fair for large file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
    while (br.read() != -1) {}
}
        end = System.nanoTime();
        System.out.println("FileReader Time: " + ((end - start) / 1000000) + " ms");

        start = System.nanoTime();
        // try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath))) {
            // Test with InputStreamReader (Byte Stream -> Char)
        //     while (isr.read() != -1) {
        //         // Reading byte by byte and decoding
        //     }
        // }

        // Buffered FileReader To make approaches more realistic and fair for large file
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
    while (br.read() != -1) {}
}
        end = System.nanoTime();
        System.out.println("InputStreamReader Time: " + ((end - start) / 1000000) + " ms");
    }
}
