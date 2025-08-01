package Java_Streams;

import java.io.*;
import java.nio.file.Files;

public class ImageByteArray {
    public static void main(String[] args) {
        File original = new File("input.jpg");
        File copied = new File("output.jpg");

        try {
            byte[] imageBytes = Files.readAllBytes(original.toPath());

            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            int b;
            while ((b = bais.read()) != -1) {
                baos.write(b);
            }

            byte[] outputBytes = baos.toByteArray();
            try (FileOutputStream fos = new FileOutputStream(copied)) {
                fos.write(outputBytes);
            }

            System.out.println("Image copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
