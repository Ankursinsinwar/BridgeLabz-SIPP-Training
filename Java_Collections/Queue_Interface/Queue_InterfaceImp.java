package Java_Collections.Queue_Interface;

import java.util.*;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class Queue_InterfaceImp implements IQueue_Interface {

    @Override
    public <T> void reverseQueue(Queue<T> queue) {
        if (queue.isEmpty())
            return;
        T front = queue.remove();
        reverseQueue(queue);
        queue.add(front);
    }

    @Override
    public List<String> generateBinaryNumbers(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < n; i++) {
            String binary = queue.remove();
            result.add(binary);
            queue.add(binary + "0");
            queue.add(binary + "1");
        }
        return result;
    }

    @Override
    public void hospitalTriageSystem() {
        Map<String, Integer> patients = new HashMap<>();
        patients.put("John", 3);
        patients.put("Alice", 5);
        patients.put("Bob", 2);

        PriorityQueue<Map.Entry<String, Integer>> triageQueue = new PriorityQueue<>(
                (a, b) -> Integer.compare(b.getValue(), a.getValue()));

        triageQueue.addAll(patients.entrySet());

        System.out.println("Triage Treatment Order:");
        while (!triageQueue.isEmpty()) {
            Map.Entry<String, Integer> entry = triageQueue.poll();
            System.out.println(entry.getKey() + " (Severity: " + entry.getValue() + ")");
        }
    }

    @Override
    public void StackUsingQueues() {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // push
        for (int val : new int[] { 1, 2, 3 }) {
            System.out.println("Stack push: " + val);
            q2.add(val);
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        // pop
        System.out.println("Stack Pop: " + q1.remove());
        // top
        System.out.println("Stack Top: " + q1.peek());
    }

    @Override
    public void CircularBuffer() {
        int[] buffer = new int[3];
        int head = 0, tail = 0, count = 0, capacity = 3;
        int[] inputs = { 1, 2, 3, 4 };

        for (int val : inputs) {
            System.out.println("insert in Buffer : " + val);
            buffer[tail] = val;
            tail = (tail + 1) % capacity;
            if (count == capacity) {
                head = (head + 1) % capacity;
            } else {
                count++;
            }
        }

        System.out.print("Circular Buffer: ");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(head + i) % capacity] + " ");
        }
        System.out.println();
    }
}
