package ControlFlowProblems;
import java.util.Scanner;

public class PowerOfNumberFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter a power: ");
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;
        while(counter < power){
                result *= number;
                counter++;
        }
        System.out.println(number + " raise to the power of "+ power + " is: " + result);
        sc.close();
    }
}
