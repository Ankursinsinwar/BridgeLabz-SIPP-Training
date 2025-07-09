package Stack_Queue_HashMap_Hashing_Function.HashMapsAndHashFunctions;

import java.util.*;

public class ZeroSumSubarrays {
    public static void findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        // Add base case for sum = 0
        map.put(0, new ArrayList<>());
        map.get(0).add(-1); // To handle subarrays starting from index 0

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int startIdx : map.get(sum)) {
                    System.out.println("Subarray found from index " + (startIdx + 1) + " to " + i);
                }
            }

            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -3, -2, -1};
        findZeroSumSubarrays(arr);
    }
}
