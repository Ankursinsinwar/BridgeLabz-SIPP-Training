package ControlFlowProblems;
import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        int originalNumber = number;

        while(originalNumber > 0){
            sum += Math.pow((originalNumber % 10),3);
            originalNumber = originalNumber / 10;
        }

        if (sum == number) 
            System.out.println(number + " is an armstrong number");
            else{
                System.out.println(number + " is not an armstrong number");
        }
        sc.close(); 
    }
}
