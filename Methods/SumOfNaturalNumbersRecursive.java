package Methods;

import java.util.Scanner;

public class SumOfNaturalNumbersRecursive {

    public static int sumRecursive(int n) {
        if (n <= 1) return n;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a natural number greater than zero.");
            sc.close();
            return;
        }
        
        int sumRec = sumRecursive(number);
        int sumForm = sumFormula(number);
        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumForm);
        System.out.println("Both results are " + (sumRec == sumForm ? "equal." : "not equal."));
        sc.close();
    }
}
