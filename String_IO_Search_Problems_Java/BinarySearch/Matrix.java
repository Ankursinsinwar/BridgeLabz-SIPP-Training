// Binary Search - Search Target in 2D Matrix
package String_IO_Search_Problems_Java.BinarySearch;
public class Matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int val = matrix[mid / cols][mid % cols];
            if (val == target)
                return true;
            else if (val < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };
        int target = 9;
        System.out.println("Is target found? " + searchMatrix(matrix, target));
    }
}