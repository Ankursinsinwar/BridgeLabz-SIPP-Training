package ControlFlowProblems;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;

        while (number != 0) {
            number = number / 10;
            count ++;
        }

        System.out.println(count + " Degits");
        sc.close();
    }
}
