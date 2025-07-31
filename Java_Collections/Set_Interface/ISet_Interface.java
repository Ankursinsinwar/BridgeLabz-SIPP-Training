package Java_Collections.Set_Interface;

import java.util.*;

interface ISet_Interface {
    <T> boolean areSetsEqual(Set<T> set1, Set<T> set2);
    <T> Set<T> getUnion(Set<T> set1, Set<T> set2);
    <T> Set<T> getIntersection(Set<T> set1, Set<T> set2);
    <T> Set<T> getSymmetricDifference(Set<T> set1, Set<T> set2);
    List<Integer> convertSetToSortedList(Set<Integer> set);
    <T> boolean isSubset(Set<T> subset, Set<T> superset);
}