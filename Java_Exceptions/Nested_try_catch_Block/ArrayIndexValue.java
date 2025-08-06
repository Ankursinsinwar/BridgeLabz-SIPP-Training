package Java_Exceptions.Nested_try_catch_Block;

import java.util.Scanner;

public class ArrayIndexValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Enter number at index " + i + " : ");
                    int num = sc.nextInt();
                    arr[i] = num;
                
            }
        System.out.print("Enter index value : "); int index = sc.nextInt();
        System.out.print("Enter divisor value : "); int divisor = sc.nextInt();

        try {
            try {
                int value = arr[index];
                System.out.println("Result: " + (value / divisor));
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
        sc.close();
    }
}
