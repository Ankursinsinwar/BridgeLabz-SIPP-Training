package Java_Collections.Set_Interface;

import java.util.*;


class Set_InterfaceImp implements ISet_Interface {

    @Override
    public <T> boolean areSetsEqual(Set<T> set1, Set<T> set2) {
        return set1.equals(set2);
    }

    @Override
    public <T> Set<T> getUnion(Set<T> set1, Set<T> set2) {
        Set<T> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    @Override
    public <T> Set<T> getIntersection(Set<T> set1, Set<T> set2) {
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    @Override
    public <T> Set<T> getSymmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        for (T elem : set2) {
            if (!result.add(elem)) {
                result.remove(elem);
            }
        }
        return result;
    }

    @Override
    public List<Integer> convertSetToSortedList(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }

    @Override
    public <T> boolean isSubset(Set<T> subset, Set<T> superset) {
        return superset.containsAll(subset);
    }
}

