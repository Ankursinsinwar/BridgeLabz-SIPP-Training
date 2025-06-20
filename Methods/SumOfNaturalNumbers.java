package Methods;

import java.util.Scanner;
public class SumOfNaturalNumbers {

    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }
        
        int sum = sumOfNaturalNumbers(n);
        System.out.println("Sum of " + n + " natural numbers is: " + sum);
        
        sc.close();    
    }
}