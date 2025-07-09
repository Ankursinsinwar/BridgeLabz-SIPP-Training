package Stack_Queue_HashMap_Hashing_Function.HashMapsAndHashFunctions;

import java.util.*;

public class PairWithGivenSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seenNumbers.contains(complement)) {
                return true; // Pair found
            }
            seenNumbers.add(num);
        }
        return false; // No pair found
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 3, 1};
        int target = 7;
        System.out.println("Array: " + java.util.Arrays.toString(arr) + ", Target Sum: " + target);
        System.out.println("Exists: " + hasPairWithSum(arr, target));
    }
}
