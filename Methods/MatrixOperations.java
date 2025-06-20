package Methods;

import java.util.Random;
public class MatrixOperations {

    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);
        return matrix;
    }

    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length, colsA = A[0].length;
        int rowsB = B.length, colsB = B[0].length;

        if (colsA != rowsB) return null;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++)
            for (int j = 0; j < colsB; j++)
                for (int k = 0; k < colsA; k++)
                    result[i][j] += A[i][k] * B[k][j];

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Incompatible matrices for operation.");
            return;
        }
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print("|" + val + "\t");
            System.out.println("\n --------------");
        }
    }

    public static void main(String[] args) {
        int[][] A = generateMatrix(2, 3);
        int[][] B = generateMatrix(2, 3);
        int[][] C = generateMatrix(3, 2);

        System.out.println("Matrix A: \n ------------------");
        printMatrix(A);
        System.out.println("\nMatrix B: \n ------------------");
        printMatrix(B);
        System.out.println("\nMatrix C: \n ------------------");
        printMatrix(C);

        System.out.println("\nA + B: \n ------------------");
        printMatrix(addMatrices(A, B));

        System.out.println("\nA - B: \n ------------------");
        printMatrix(subtractMatrices(A, B));

        System.out.println("\nA x C: \n ------------------");
        printMatrix(multiplyMatrices(A, C));
    }
}