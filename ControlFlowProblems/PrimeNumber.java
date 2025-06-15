package ControlFlowProblems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number ( grater than 1): ");
        int number = sc.nextInt();

        boolean isPrime = true;
        if (number <= 1) {
            System.out.println("Number should be grather than 1");
            sc.close();
            return;
        }
        for (int i = 2; i < number; i++){
            if (number % i == 0) {
                isPrime = false;
                break;
            }   
        }

        System.out.println(isPrime);
        sc.close();
    }
}

