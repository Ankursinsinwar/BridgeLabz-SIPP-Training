package Runtime_Analysis_And_Big_O_Notation;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SearchStructureComparison {

    public static void main(String[] args) {
        int[] sizes = {1000, 100000, 1000000};

        for (int size : sizes) {
            int target = size - 1;  // Worst-case scenario: last element
            System.out.println("\nDataset Size: " + size);

            // Array (Linear Search)
            int[] array = new int[size];
            for (int i = 0; i < size; i++) array[i] = i;
            long start = System.nanoTime();
            for (int val : array) {
                if (val == target) break;
            }
            long end = System.nanoTime();
            System.out.println("Array Search Time: " + ((end - start) / 1000000.0) + " ms");

            // HashSet (O(1) average-case)
            Set<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < size; i++) hashSet.add(i);
            start = System.nanoTime();
            hashSet.contains(target);
            end = System.nanoTime();
            System.out.println("HashSet Search Time: " + ((end - start) / 1000000.0) + " ms");

            // TreeSet (O(log N))
            Set<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < size; i++) treeSet.add(i);
            start = System.nanoTime();
            treeSet.contains(target);
            end = System.nanoTime();
            System.out.println("TreeSet Search Time: " + ((end - start) / 1000000.0) + " ms");
        }
    }
}

