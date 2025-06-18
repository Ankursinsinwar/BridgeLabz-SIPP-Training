package Arrays;

import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        int[] array = new int[rows * columns];
        int index = 0;

        System.out.println("Enter elements: ");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                matrix[i][j] = sc.nextInt();

        for (int[] row : matrix)
            for (int elem : row)
                array[index++] = elem;

        for (int value : array) System.out.print("1D Array: " + value + " ");
        sc.close();
    }
}
