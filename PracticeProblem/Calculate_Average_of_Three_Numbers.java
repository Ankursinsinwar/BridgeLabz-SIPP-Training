package Problem_11_06_25;

import java.util.Scanner;
class Calculate_Average_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter Number 3: ");
        int num3 = sc.nextInt();
        int average = (num1 + num2 + num3) / 3;
        System.out.println("Average = " + average);
        sc.close();
    }
}
