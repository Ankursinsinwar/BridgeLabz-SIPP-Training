package Java_Collections.List_Interface;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Interface
interface IList_Interface {
    <T> void reverse(List<T> list);
    Map<String, Integer> getFrequency(List<String> list);
    <T> void rotate(List<T> list, int k);
    <T> List<T> removeDuplicates(List<T> list);
    <T> T getNthFromEnd(LinkedList<T> list, int n);
}