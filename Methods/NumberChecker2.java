package Methods;

import java.util.Scanner;

public class NumberChecker2 {

    public static int sumOfProperDivisors(int number) {
        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 1)
            return false;
        return sumOfProperDivisors(number) == number;
    }

    public static boolean isAbundantNumber(int number) {
        if (number <= 1)
            return false;
        return sumOfProperDivisors(number) > number;
    }

    public static boolean isDeficientNumber(int number) {
        if (number <= 1)
            return false;
        return sumOfProperDivisors(number) < number;
    }

    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 2; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Is perfect number? " + isPerfectNumber(number));
        System.out.println("Is abundant number? " + isAbundantNumber(number));
        System.out.println("Is deficient number? " + isDeficientNumber(number));
        System.out.println("Is strong number? " + isStrongNumber(number));
        
        sc.close();
    }
}