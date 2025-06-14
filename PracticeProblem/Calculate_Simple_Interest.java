package PracticeProblem;

import java.util.Scanner;
class Calculate_Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int principal = sc.nextInt();
        System.out.print("Enter Rate (%): ");
        int rate = sc.nextInt();
        System.out.print("Enter Time (years): ");
        int time = sc.nextInt();
        int simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + simpleInterest);
        sc.close();
    }
}
