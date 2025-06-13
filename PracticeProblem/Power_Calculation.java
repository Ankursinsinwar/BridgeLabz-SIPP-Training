package Problem_11_06_25;

import java.util.Scanner;
class Power_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int base = sc.nextInt();
        System.out.print("Enter Exponent: ");
        int exponent = sc.nextInt();
        int power = (int) (Math.pow(base, exponent));
        System.out.println(base + " ^ " + exponent + " = " + power);
        sc.close();
    }
}
