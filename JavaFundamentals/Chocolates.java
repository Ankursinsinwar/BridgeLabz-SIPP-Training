// Question 25
package JavaFundamentals;

import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = input.nextInt();

        System.out.print("Enter number of children: ");
        int children = input.nextInt();

        int eachGets = chocolates / children;
        int remaining = chocolates % children;

        System.out.println("The number of chocolates each child gets is " + eachGets + " and the number of remaining chocolates is " + remaining);

        input.close();
    }
}
