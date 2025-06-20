package Methods;

import java.util.Scanner;
public class ChocolateDistribution {
    public static int[] remainderAndQuotient(int chocolates, int children) {
        int eachGets = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{eachGets, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();

        if (children <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        int[] result = remainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[0] + " chocolates, Remaining: " + result[1]);
        sc.close();
    }
}