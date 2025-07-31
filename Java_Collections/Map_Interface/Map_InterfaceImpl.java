package Java_Collections.Map_Interface;

import java.util.*;

public class Map_InterfaceImpl implements IMap_Interface {

    @Override
    public Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> freqMap = new HashMap<>();
        text = text.toLowerCase().replaceAll("[^a-z\\s]", "");
        for (String word : text.split("\\s+")) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }
        return freqMap;
    }

    @Override
    public Map<Integer, List<String>> invertMap(Map<String, Integer> map) {
        Map<Integer, List<String>> inverted = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            inverted.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        return inverted;
    }

    @Override
    public String getKeyWithHighestValue(Map<String, Integer> map) {
        return map.entrySet().stream()
                  .max(Map.Entry.comparingByValue())
                  .map(Map.Entry::getKey)
                  .orElse(null);
    }

    @Override
    public Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> merged = new HashMap<>(map1);
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            merged.put(entry.getKey(), merged.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }
        return merged;
    }

    @Override
    public Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> grouped = new HashMap<>();
        for (Employee emp : employees) {
            grouped.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }
        return grouped;
    }
}
