// Question 4
package JavaFundamentals;

import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Fee (INR): ");
        double fee = scanner.nextDouble();

        System.out.print("Enter University Discount (%) : ");
        double discountPercent = scanner.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

        scanner.close();
    }
}
