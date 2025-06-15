package ControlFlowProblems;
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double value = sc.nextDouble();
            if (value == 0.0) break;
            total += value;
        }

        System.out.println("Total sum: " + total);
        sc.close();
    }
}