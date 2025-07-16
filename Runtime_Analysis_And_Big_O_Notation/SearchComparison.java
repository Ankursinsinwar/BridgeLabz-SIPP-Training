package Runtime_Analysis_And_Big_O_Notation;

import java.util.Arrays;
import java.util.Random;

public class SearchComparison {

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    // Binary Search (requires sorted array)
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        long start, end;

        int[] sizes = { 1000, 10000, 1000000 };

        for (int size : sizes) {
            int[] data = new int[size];
            for (int i = 0; i < size; i++) data[i] = new Random().nextInt(size * 2);

            int target = data[new Random().nextInt(size)];
            
            System.out.println("\nDataset size: " + size);
            
            start = System.nanoTime();
            linearSearch(data, target);
            end = System.nanoTime();
            System.out.println("Linear Search: " + (end - start) / 10000.0 + " ms");
            
            Arrays.sort(data);
            start = System.nanoTime();
            binarySearch(data, target);
            end = System.nanoTime();
            System.out.println("Binary Search: " + (end - start) / 10000.0 + " ms");
        }
    }
}