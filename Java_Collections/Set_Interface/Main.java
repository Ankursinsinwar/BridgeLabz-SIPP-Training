package Java_Collections.Set_Interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ISet_Interface set_Interface_Object = new Set_InterfaceImp();

        System.out.println("########## Set Interface ##########");

        // 1. Are Sets Equal
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 2, 1));
        System.out.println("Set 1 : [1, 2, 3]");
        System.out.println("Set 2 : [3, 2, 1]");
        System.out.println("Are Sets Equal: " + set_Interface_Object.areSetsEqual(s1, s2));

        System.out.println("------------------------");
        
        // 2. Union and Intersection
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5));
        System.out.println("Set 1 : " + setA);
        System.out.println("Set 2 : " + setB);
        System.out.println("Union: " + set_Interface_Object.getUnion(setA, setB));
        System.out.println("Intersection: " + set_Interface_Object.getIntersection(setA, setB));
        
        // 3. Symmetric Difference
        System.out.println("Symmetric Difference: " + set_Interface_Object.getSymmetricDifference(setA, setB));
        
        System.out.println("------------------------");
        
        // 4. Convert to Sorted List
        Set<Integer> unsortedSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        System.out.println("unsorted Set : [5, 3, 9, 1]");
        System.out.println("Sorted Set : " + set_Interface_Object.convertSetToSortedList(unsortedSet));
        
        System.out.println("------------------------");
        
        // 5. Is Subset
        Set<Integer> sub = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> sup = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Subset : " + sub);
        System.out.println("Superset : " + sup);
        System.out.println("Is Subset: " + set_Interface_Object.isSubset(sub, sup));
    }
}
