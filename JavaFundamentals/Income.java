// Question 24
package JavaFundamentals;

import java.util.Scanner;

public class Income {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter salary (INR): ");
        double salary = input.nextDouble();

        System.out.print("Enter bonus (INR): ");
        double bonus = input.nextDouble();

        double income = salary + bonus;

        System.out.println("The salary is INR " + salary + " and the bonus is INR " + bonus + ". Hence Total Income is INR " + income);

        input.close();
    }
}
