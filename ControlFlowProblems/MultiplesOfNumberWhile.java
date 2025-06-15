package ControlFlowProblems;
import java.util.Scanner;

public class MultiplesOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0 || number >100){
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;        
        }

        int counter = number - 1;
        while(counter > 1){
            if (number % counter == 0) {
                System.out.println(counter);
            }
            counter --;
        }

        sc.close();
    }
}
