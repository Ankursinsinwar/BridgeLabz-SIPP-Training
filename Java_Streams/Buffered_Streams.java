package Java_Streams;
import java.io.*;

public class Buffered_Streams {
    private static final int BUFFER_SIZE = 4096; //chunks of 4 KB (4096 bytes).

    public static void main(String[] args) {

        long startBuffered = System.nanoTime();
        copyWithBufferedStream("largefile.txt", "copy_buffered.txt");
        long endBuffered = System.nanoTime();

        long startUnbuffered = System.nanoTime();
        copyWithUnbufferedStream("largefile.txt", "copy_buffered.txt");
        long endUnbuffered = System.nanoTime();

        System.out.println("Buffered Stream Time: " + (endBuffered - startBuffered) / 1000000 + " ms");
        System.out.println("Unbuffered Stream Time: " + (endUnbuffered - startUnbuffered) / 1000000 + " ms");
    }

    public static void copyWithBufferedStream(String source, String dest) {
        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Buffered copy failed: " + e.getMessage());
        }
    }

    public static void copyWithUnbufferedStream(String source, String dest) {
        try (
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest)
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Unbuffered copy failed: " + e.getMessage());
        }
    }
}