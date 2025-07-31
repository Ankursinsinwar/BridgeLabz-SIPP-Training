package Java_Collections.List_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Main class
public class Main {
    public static void main(String[] args) {
        IList_Interface list_interface_object = new List_InterfaceImp();

        System.out.println("########## List Interface ##########");

        // 1. Reverse
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Orignal: " + list1);
        list_interface_object.reverse(list1);
        System.out.println("Reversed: " + list1);
        
        System.out.println("----------------------------");
        
        // 2. Frequency
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println("Orignal: " + words);
        System.out.println("Frequency: " + list_interface_object.getFrequency(words));
        
        System.out.println("----------------------------");
        
        // 3. Rotate
        List<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Orignal: " + list2);
        int k  = 2;
        list_interface_object.rotate(list2, k);
        System.out.println("Rotated "+ k + " times: " + list2);
        
        System.out.println("----------------------------");
        
        
        // 4. Remove Duplicates
        List<Integer> dupList = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println("Orignal: " + dupList);
        System.out.println("Without Duplicates: " + list_interface_object.removeDuplicates(dupList));
        
        System.out.println("----------------------------");
        
        // 5. Nth from End
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println("Orignal: " + linkedList);
        System.out.println("2nd from End: " + list_interface_object.getNthFromEnd(linkedList, 2));
    }
}