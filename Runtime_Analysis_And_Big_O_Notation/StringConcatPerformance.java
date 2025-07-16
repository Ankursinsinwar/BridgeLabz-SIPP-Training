package Runtime_Analysis_And_Big_O_Notation;

public class StringConcatPerformance {

    public static void main(String[] args) {
        int[] testSizes = {1000, 10000, 1000000};
        long start, end;

        for (int N : testSizes) {
            System.out.println("\nConcatenation Count: " + N);

            // Using String (Immutable, O(N²))
            if (N <= 10000) {  // Avoid huge cost
                start = System.nanoTime();
                @SuppressWarnings("unused")
                String s = "Java";
                for (int i = 0; i < N; i++) {
                    s += "Performance Test";
                }
                end = System.nanoTime();
                System.out.println("String Time: " + ((end - start) / 1000000) + " ms");
            } else {
                System.out.println("String Time: Unfeasible (too slow)");
            }

            // Using StringBuilder (Fastest, not thread-safe)
            start = System.nanoTime();
            StringBuilder sb = new StringBuilder("Java");
            for (int i = 0; i < N; i++) {
                sb.append("Performance Test");
            }
            end = System.nanoTime();
            System.out.println("StringBuilder Time: " + ((end - start) / 1000000) + " ms");

            // Using StringBuffer (Slower than StringBuilder but Thread-safe)
            start = System.nanoTime();
            StringBuffer sbf = new StringBuffer("Java");
            for (int i = 0; i < N; i++) {
                sbf.append("Performance Test");
            }
            end = System.nanoTime();
            System.out.println("StringBuffer Time: " + ((end - start) / 1000000) + " ms");
        }
    }
}
