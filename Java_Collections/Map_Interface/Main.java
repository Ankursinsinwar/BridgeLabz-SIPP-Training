package Java_Collections.Map_Interface;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        IMap_Interface ops = new Map_InterfaceImpl();

        System.out.println("########## Map Interface ##########");

        // Word Frequency
        String text = "Hello world, hello Java!";
        System.out.println("Text : " + text);
        System.out.println("Word Frequency: " + ops.countWordFrequency(text));

        System.out.println("------------------------");

        Map<String, Integer> original = Map.of("A", 1, "B", 2, "C", 1);
        System.out.println(original);
        System.out.println("Inverted Map: " + ops.invertMap(original));
        
        // Max Key
        System.out.println("Max Value Key: " + ops.getKeyWithHighestValue(original));
        
        System.out.println("------------------------");
        // Merge Maps
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);
        System.out.println("Map 1 : " + map1);
        System.out.println("Map 2 : " + map2);
        System.out.println("Merged Map: " + ops.mergeMaps(map1, map2));
        
        System.out.println("------------------------");

        // Group by Department
        List<Employee> emps = List.of(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );
        System.out.println("Grouped by Department: " + ops.groupByDepartment(emps));
    }
}
