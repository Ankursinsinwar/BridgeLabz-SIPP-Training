// Problem: Compare StringBuffer with StringBuilder for String Concatenation
package String_IO_Search_Problems_Java.StringBuffer;
public class StringBuffer_vs_StringBuilder {
    public static void main(String[] args) {
        int n = 1000000;
        long startTime, endTime;

        // StringBuilder
        StringBuilder sb = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");

        // StringBuffer
        StringBuffer sbf = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sbf.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");
    }
}