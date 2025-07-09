package Stack_Queue_HashMap_Hashing_Function.HashMapsAndHashFunctions;

import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        } // Store all unique elements

        int maxLen = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {
                int curr = num;
                int length = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    length++;
                }

                maxLen = Math.max(maxLen, length);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {0, 3, 9, 2, 5, 8, 4, 6, 0, 1};
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Longest Consecutive Length: " + longestConsecutive(arr));
    }
}
