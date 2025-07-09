package Stack_Queue_HashMap_Hashing_Function.HashMapsAndHashFunctions;

import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];

            if (map.containsKey(comp)) {
                return new int[]{map.get(comp), i}; // Found the pair
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // If not found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(nums, target);
        System.out.println("Indices: " + res[0] + ", " + res[1]);
    }
}
