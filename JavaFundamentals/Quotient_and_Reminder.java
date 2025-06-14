//Question 15
package JavaFundamentals;

import java.util.Scanner;

public class Quotient_and_Reminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two numbers " + number1 + " and " + number2);
        scanner.close();
    }
}
