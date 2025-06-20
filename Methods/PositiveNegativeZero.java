package Methods;

import java.util.Scanner;
public class PositiveNegativeZero {

    public static int positiveNegativeZero(int number) {
        if (number > 0) return 1;
        else if (number == 0) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = positiveNegativeZero(number);

        if (result == 1) System.out.println("Number is Positive");
        else if (result == 0) System.out.println("Number is Zero");
        else System.out.println("Number is Negativee");
        

        sc.close();
    }
}