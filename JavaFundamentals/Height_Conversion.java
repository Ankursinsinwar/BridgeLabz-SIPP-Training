// Question 8
package JavaFundamentals;

import java.util.Scanner;
public class Height_Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double cm = scanner.nextDouble();

        double inches = cm / 2.54;
        double feet = inches / 12;

        System.out.println("Your Height in cm is " + cm + " while in feet is " + (int)feet + " and inches is " + String.format("%.2f", inches % 12));
        
        scanner.close();
    }
}
