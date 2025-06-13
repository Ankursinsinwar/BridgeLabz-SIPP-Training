//Question 13
package Problem_12_06_25;

import java.util.Scanner;

public class Area_of_triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = scanner.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);
        scanner.close();
    }
}
