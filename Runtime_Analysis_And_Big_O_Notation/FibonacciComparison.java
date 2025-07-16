package Runtime_Analysis_And_Big_O_Notation;

public class FibonacciComparison {

    public static void main(String[] args) {
        int[] testValues = {10, 30, 50};

        for (int n : testValues) {
            System.out.println("\nFibonacci(" + n + ")");

            // Recursive Fibonacci (skip if n > 40 to avoid long wait)
            if (n <= 40) {
                long start = System.nanoTime();
                fibonacciRecursive(n);
                long end = System.nanoTime();
                System.out.println("Recursive Time: " + ((end - start) / 100000.0) + " ms");
            } else {
                System.out.println("Recursive Time Unfeasible (O(2^n) growth)");
            }

            // Iterative Fibonacci
            long start = System.nanoTime();
            fibonacciIterative(n);
            long end = System.nanoTime();
            System.out.println("Iterative Time: " + ((end - start) / 100000.0) + " ms");
        }
    }

    // Exponential Time Recursive Approach
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Linear Time Iterative Approach
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}

