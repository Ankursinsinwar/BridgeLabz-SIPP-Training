// Question 26
package Problem_12_06_25;

import java.util.Scanner;

public class TemperaturConversion2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double Celsius = input.nextDouble();

        double farenheitResult = (Celsius * 9 / 5) + 32;

        System.out.println("The " + Celsius + " celsius is " + farenheitResult + " farenheitResult");

        input.close();
    }
}
