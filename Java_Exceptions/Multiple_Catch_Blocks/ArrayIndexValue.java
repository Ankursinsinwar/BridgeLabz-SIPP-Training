package Java_Exceptions.Multiple_Catch_Blocks;

import java.util.Scanner;

public class ArrayIndexValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter length of array [0 for null] : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            if (n == 0) {
                arr = null;
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print("Enter number at index " + i + " : ");
                    int num = sc.nextInt();
                    arr[i] = num;
                }
            }
            // int[] arr = null;
            System.out.print("Enter index value : ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
        sc.close();
    }
}
