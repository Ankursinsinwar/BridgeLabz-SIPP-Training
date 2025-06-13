// Question 28
package Problem_12_06_25;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal amount (INR): ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest (%): ");
        double rate = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();

        double interest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + interest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);

        input.close();
    }
}
