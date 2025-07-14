// Challenge Problem: Linear and Binary Search
package String_IO_Search_Problems_Java.Challenge;
import java.util.Arrays;

public class LinearBinarySearch {
    public static int findFirstMissingPositive(int[] arr) {
        boolean[] present = new boolean[arr.length + 2];
        for (int num : arr) {
            if (num > 0 && num <= arr.length) {
                present[num] = true;
            }
        }
        for (int i = 1; i < present.length; i++) {
            if (!present[i]) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("First missing positive: " + findFirstMissingPositive(arr));
        System.out.println("Index of 4 (binary search): " + binarySearch(arr, 4));
    }
}