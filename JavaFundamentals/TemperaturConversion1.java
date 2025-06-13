// question 20
package Problem_12_06_25;

import java.util.Scanner;

public class TemperaturConversion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
        scanner.close();
    }
}
