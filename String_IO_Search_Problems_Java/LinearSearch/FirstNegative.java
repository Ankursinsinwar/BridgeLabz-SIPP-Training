// Linear Search - Find First Negative Number
package String_IO_Search_Problems_Java.LinearSearch;
public class FirstNegative {
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 2, -5, 6};
        System.out.println("First negative number at index: " + findFirstNegative(nums));
    }
}