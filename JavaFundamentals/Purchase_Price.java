// Question 17
package Problem_12_06_25;

import java.util.Scanner;

public class Purchase_Price {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter unit price (INR): ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double total = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and the unit price is INR " + unitPrice);
        scanner.close();
    }
}
