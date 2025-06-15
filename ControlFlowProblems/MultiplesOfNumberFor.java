package ControlFlowProblems;
import java.util.Scanner;

public class MultiplesOfNumberFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0 || number >100){
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;        
        }
        
        for(int i = 100; i >= 1; i--){
            if (number % i == 0) {
                System.out.println(i);
            }
            
        }

        sc.close();
    }
}
