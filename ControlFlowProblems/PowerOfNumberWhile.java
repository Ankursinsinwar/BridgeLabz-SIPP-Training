package ControlFlowProblems;
import java.util.Scanner;

public class PowerOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter a power: ");
        int power = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= power; i++){
                result *= number;
        }
        System.out.println(number + " raise to the power of "+ power + " is: " + result);
        sc.close();
    }
}
