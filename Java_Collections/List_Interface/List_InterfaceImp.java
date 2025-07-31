package Java_Collections.List_Interface;

import java.util.*;

class List_InterfaceImp implements IList_Interface {

    @Override
    public <T> void reverse(List<T> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            // just swaping pointers value
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    @Override
    public Map<String, Integer> getFrequency(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String item : list) {
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }
        return freqMap;
    }

    @Override
    public <T> void rotate(List<T> list, int k) {
        int n = list.size();
        k = k % n;
        if (k == 0) return;

        List<T> temp = new ArrayList<>(list.subList(k, n));
        temp.addAll(list.subList(0, k));

        for (int i = 0; i < n; i++) {
            list.set(i, temp.get(i));
        }
    }

    @Override
    public <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new HashSet<>();
        List<T> result = new ArrayList<>();

        for (T item : list) {
            if (seen.add(item)) {
                result.add(item);
            }
        }
        return result;
    }

    // find the Nth element from the end without calculating its size.
    @Override
    public <T> T getNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();

        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) return null;
            first.next();
        }

        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }
}