// Binary Search - Find Rotation Point
package String_IO_Search_Problems_Java.BinarySearch;
public class RotationPoint {
    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[right])
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {6, 7, 1, 2, 3, 4, 5};
        System.out.println("Rotation point index: " + findRotationPoint(nums));
    }
}