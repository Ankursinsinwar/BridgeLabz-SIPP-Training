// Question 11
package Problem_12_06_25;

import java.util.Scanner;

public class Side_of_square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter perimeter of the square: ");
        double perimeter = scanner.nextDouble();
        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        scanner.close();
    }
}
