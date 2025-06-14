// Question 18
package JavaFundamentals;

import java.util.Scanner;

public class Feet_to_Yards_and_Miles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = scanner.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
        scanner.close();
    }
}
