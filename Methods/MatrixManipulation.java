package Methods;

import java.util.Random;
import java.util.Scanner;

public class MatrixManipulation {

    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }

    public static int determinant3x3(int[][] matrix) {
        int det = matrix[0][0]*(matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1])
                - matrix[0][1]*(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0])
                + matrix[0][2]*(matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]);
        return det;
    }

    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            return null;
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double)det;
        inverse[0][1] = -matrix[0][1] / (double)det;
        inverse[1][0] = -matrix[1][0] / (double)det;
        inverse[1][1] = matrix[0][0] / (double)det;
        return inverse;
    }

    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) {
            return null;
        }
        double[][] inverse = new double[3][3];
        // Calculate cofactors matrix
        inverse[0][0] =  (matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1]);
        inverse[0][1] = -(matrix[0][1]*matrix[2][2] - matrix[0][2]*matrix[2][1]);
        inverse[0][2] =  (matrix[0][1]*matrix[1][2] - matrix[0][2]*matrix[1][1]);

        inverse[1][0] = -(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0]);
        inverse[1][1] =  (matrix[0][0]*matrix[2][2] - matrix[0][2]*matrix[2][0]);
        inverse[1][2] = -(matrix[0][0]*matrix[1][2] - matrix[0][2]*matrix[1][0]);

        inverse[2][0] =  (matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]);
        inverse[2][1] = -(matrix[0][0]*matrix[2][1] - matrix[0][1]*matrix[2][0]);
        inverse[2][2] =  (matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0]);

        double[][] adjoint = transposeDouble(inverse);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                adjoint[i][j] = adjoint[i][j] / det;
            }
        }
        return adjoint;
    }

    // Helper method to transpose a double matrix
    public static double[][] transposeDouble(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Method to display an int matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print("|" + val + "\t");
            
            }
            // System.out.println("\n --------------");
            System.out.println();
        }
    }

    // Method to display a double matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("|%.3f ", val);
                

            }
            // System.out.println("\n -------------------");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = createRandomMatrix(rows, cols);

        System.out.println("\nRandom Matrix:");
        displayMatrix(matrix);

        int[][] transposed = transpose(matrix);
        System.out.println("\nTransposed Matrix:");
        displayMatrix(transposed);

        if (rows == 2 && cols == 2) {
            int det = determinant2x2(matrix);
            System.out.println("\nDeterminant of 2x2 matrix: " + det);

            double[][] inv = inverse2x2(matrix);
            if (inv != null) {
                System.out.println("\nInverse of 2x2 matrix:");
                displayMatrix(inv);
            } else {
                System.out.println("\nInverse does not exist (determinant is 0).");
            }
        } else if (rows == 3 && cols == 3) {
            int det = determinant3x3(matrix);
            System.out.println("\nDeterminant of 3x3 matrix: " + det);

            double[][] inv = inverse3x3(matrix);
            if (inv != null) {
                System.out.println("\nInverse of 3x3 matrix:");
                displayMatrix(inv);
            } else {
                System.out.println("\nInverse does not exist (determinant is 0).");
            }
        } else {
            System.out.println("\nDeterminant and inverse calculation only supported for 2x2 and 3x3 matrices.");
        }

        scanner.close();
    }
}