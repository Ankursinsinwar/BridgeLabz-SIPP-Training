package Java_Exceptions.throw_vs_throws;

import java.util.Scanner;

public class InterestCalculator {
    static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0)
            throw new IllegalArgumentException();
        return amount * rate * years / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Amount : "); int ammount = sc.nextInt();
            System.out.print("Enter Rate : "); int rate = sc.nextInt();
            System.out.print("Enter Years : "); int years = sc.nextInt();
            double interest = calculateInterest(ammount, rate, years);
            System.out.println("Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
        sc.close();
    }
}