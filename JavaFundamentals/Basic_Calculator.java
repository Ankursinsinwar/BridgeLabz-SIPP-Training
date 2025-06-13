// Question 16
package Problem_12_06_25;

import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        float number1 = scanner.nextFloat();
        System.out.print("Enter 2nd number: ");
        float number2 = scanner.nextFloat();

        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
                            + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        scanner.close();
    }
}
