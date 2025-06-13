// Question 10
package Problem_12_06_25;

import java.util.Scanner;

public class Kilometers_to_miles_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        double miles = km / 1.6;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}
