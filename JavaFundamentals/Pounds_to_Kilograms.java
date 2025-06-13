// Question 23
package Problem_12_06_25;

import java.util.Scanner;

public class Pounds_to_Kilograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        double kg = pounds / 2.2;

        System.out.println("The weight of the person in pounds is " + pounds + " and in kg is " + kg);

        input.close();
    }
}
