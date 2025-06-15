package ControlFlowProblems;
import java.util.Scanner;

public class FindFactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        int counter = 1;
        System.out.println("Factors of " + number + ":");
        while (counter < number) {
            if (number % counter == 0) {
                System.out.println(counter);
            }
            counter ++;
        }
        sc.close();
    }
}