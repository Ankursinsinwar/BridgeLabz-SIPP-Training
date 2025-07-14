// Binary Search - First and Last Occurrence
package String_IO_Search_Problems_Java.BinarySearch;
public class FirstLastOccurrence {
    public static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return result;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (arr[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        System.out.println("First Occurrence: " + firstOccurrence(arr, target));
        System.out.println("Last Occurrence: " + lastOccurrence(arr, target));
    }
}