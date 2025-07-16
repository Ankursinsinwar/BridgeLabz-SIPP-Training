package Runtime_Analysis_And_Big_O_Notation;

import java.util.Arrays;
import java.util.Random;

public class SortingComparison {

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        long start, end;

        for (int size : sizes) {
            System.out.println("\nDataset Size: " + size);
            int[] original = new int[size];
            for (int i = 0; i < size; i++) original[i] = new Random().nextInt(size * 2);{

            // Bubble Sort
            if (size <= 10000) { 
                int[] bubbleArray = Arrays.copyOf(original, original.length);
                start = System.nanoTime();
                bubbleSort(bubbleArray);
                end = System.nanoTime();
                System.out.println("Bubble Sort Time: " + ((end - start) / 1000000) + " ms");
            } else {
                System.out.println("Bubble Sort Time: Unfeasible (>1hr)");
            }

            // Merge Sort 
            int[] mergeArray = Arrays.copyOf(original, original.length);
            start = System.nanoTime();
            mergeSort(mergeArray, 0, mergeArray.length - 1);
            end = System.nanoTime();
            System.out.println("Merge Sort Time: " + ((end - start) / 1000000) + " ms");

            // Quick Sort
            int[] quickArray = Arrays.copyOf(original, original.length);
            start = System.nanoTime();
            quickSort(quickArray, 0, quickArray.length - 1);
            end = System.nanoTime();
            System.out.println("Quick Sort Time: " + ((end - start) / 1000000) + " ms");
        }
    }
    }


    // Bubble Sort (O(n^2))
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // Merge Sort
    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);      // Sort left half
            mergeSort(arr, mid + 1, right); // Sort right half

            merge(arr, left, mid, right);   // Merge both halves
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of the two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        // Merge the temp arrays
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }

        // Copy remaining elements
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // Quick Sort
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // Partition index
            quickSort(arr, low, pi - 1);  // Sort left
            quickSort(arr, pi + 1, high); // Sort right
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Index of smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and pivot (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
