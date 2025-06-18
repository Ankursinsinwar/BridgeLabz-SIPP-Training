package Arrays;

import java.util.Scanner;

public class Multiplication6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] multiplicationResult = new int[4];

        System.out.print("Enter the number:");
        int number = sc.nextInt();
        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (i + 6);
        }

        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
        sc.close();
    }
}