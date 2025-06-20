package Methods;

import java.util.Scanner;

public class NumberAnalysis {
    public static boolean isPositive(int number) {
        return number >= 0;
    }


    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        }
        else if (number1 == number2) {
            return 0;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int number : numbers) {
            if (isPositive(number)) {
                if (isEven(number)) System.out.println(number + " is positive and even.");
                else System.out.println(number + " is positive and odd.");
            }
            else System.out.println(number + " is negative.");
        }

        int comparison = compare(numbers[0], numbers[4]);

        if (comparison == 1) {
            System.out.println("The first element is greater than the last element.");
        }
        else if (comparison == 0) {
            System.out.println("The first and last elements are equal.");
        }
        else {
            System.out.println("The first element is less than the last element.");
        }
        sc.close();
    }
}