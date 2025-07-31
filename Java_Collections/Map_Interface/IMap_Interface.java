package Java_Collections.Map_Interface;

import java.util.*;

public interface IMap_Interface {
    Map<String, Integer> countWordFrequency(String text);
    Map<Integer, List<String>> invertMap(Map<String, Integer> map);
    String getKeyWithHighestValue(Map<String, Integer> map);
    Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2);
    Map<String, List<Employee>> groupByDepartment(List<Employee> employees);
}
