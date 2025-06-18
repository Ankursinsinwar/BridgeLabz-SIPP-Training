package Arrays;

import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = String.valueOf(number).length();
        int[] digits = new int[digitCount];

        int i = 0;
        while (number != 0) {
            digits[i++] = number % 10;
            number /= 10;
        }

        System.out.print("Reversed number: ");
        for (int j = 0; j < i; j++) {
            System.out.print(digits[j]);
        }
        sc.close();
    }
}
