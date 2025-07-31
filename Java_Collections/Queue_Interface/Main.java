package Java_Collections.Queue_Interface;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        IQueue_Interface tasks = new Queue_InterfaceImp();

        System.out.println("########## Queue Interface ##########");
        // 1. Reverse a Queue
        Queue<Integer> queue = new LinkedList<>(List.of(10, 20, 30));
        System.out.println("Original Queue: " + queue);
        tasks.reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);

        System.out.println("------------------------");

        // 2. Generate Binary Numbers
        List<String> binaryNumbers = tasks.generateBinaryNumbers(5);
        System.out.println("Binary Numbers: " + binaryNumbers);

        System.out.println("------------------------");

        // 3. Hospital Triage
        tasks.hospitalTriageSystem();

        System.out.println("------------------------");

        // 4. Stack using Queues
        tasks.StackUsingQueues();

        System.out.println("------------------------");

        // 5. Circular Buffer
        tasks.CircularBuffer();

        System.out.println("------------------------");
    }
}
