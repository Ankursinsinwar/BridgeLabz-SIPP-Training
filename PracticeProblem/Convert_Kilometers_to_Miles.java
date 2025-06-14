package PracticeProblem;

import java.util.Scanner;
public class Convert_Kilometers_to_Miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in Km: ");
        int kilometers = sc.nextInt();
        double miles =  kilometers * 0.621371;
        System.out.println(kilometers + " Km = " + miles + " Miles");
        sc.close();
    }
}
