package LinkedListProblems;

import java.util.HashMap;
import java.util.Map;

// Node representing a process in the circular queue
class ProcessNode {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime = 0;
    int turnaroundTime = 0;
    ProcessNode next;

    public ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}


class RoundRobinList {
    private ProcessNode head = null;
    private ProcessNode tail = null;

    private final int timeQuantum;
    private int totalProcesses = 0;
    private int totalTime = 0;

    public RoundRobinList(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add process at end
    public void addProcess(int id, int burst, int priority) {
        ProcessNode newNode = new ProcessNode(id, burst, priority);
        totalProcesses++;

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Remove completed process
    private void removeProcess(ProcessNode prev, ProcessNode current) {
        if (current == head && current == tail) {
            head = tail = null;
        } else if (current == head) {
            head = head.next;
            tail.next = head;
        } else if (current == tail) {
            tail = prev;
            tail.next = head;
        } else {
            prev.next = current.next;
        }

        totalProcesses--;
    }

    // Display process queue
    private void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }
        ProcessNode temp = head;
        System.out.println("Current Process Queue:");
        do {
            System.out.println("P" + temp.processId + " [Remaining: " + temp.remainingTime + "] ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Simulate round robin scheduling
    public void simulate() {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        Map<Integer, Integer> waitingTimes = new HashMap<>();
        Map<Integer, Integer> turnaroundTimes = new HashMap<>();
        Map<Integer, Integer> startTime = new HashMap<>();

        ProcessNode current = head;
        ProcessNode prev = tail;
        int currentTime = 0;

        while (totalProcesses > 0) {
            if (current.remainingTime > 0) {
                if (!startTime.containsKey(current.processId)) {
                    startTime.put(current.processId, currentTime);
                }

                int timeSpent = Math.min(current.remainingTime, timeQuantum);
                current.remainingTime -= timeSpent;
                currentTime += timeSpent;

                if (current.remainingTime == 0) {
                    current.turnaroundTime = currentTime;
                    current.waitingTime = current.turnaroundTime - current.burstTime;
                    waitingTimes.put(current.processId, current.waitingTime);
                    turnaroundTimes.put(current.processId, current.turnaroundTime);

                    System.out.println("Process P" + current.processId + " completed.");
                    removeProcess(prev, current);
                    current = prev.next;
                    displayProcesses();
                    continue;
                }
            }
            prev = current;
            current = current.next;
        }

        // Display average metrics
        double totalWT = 0, totalTAT = 0;
        for (int pid : waitingTimes.keySet()) {
            totalWT += waitingTimes.get(pid);
            totalTAT += turnaroundTimes.get(pid);
            System.out.println("P" + pid + " -> Waiting Time: " + waitingTimes.get(pid) + ", Turnaround Time: " + turnaroundTimes.get(pid));
        }

        System.out.printf("\nAverage Waiting Time: %.2f\n", totalWT / waitingTimes.size());
        System.out.printf("Average Turnaround Time: %.2f\n", totalTAT / turnaroundTimes.size());
    }
}

public class RoundRobinScheduler {
    public static void main(String[] args) {
        RoundRobinList scheduler = new RoundRobinList(4); // Time quantum = 4

        // Add sample processes
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 4, 2);
        scheduler.addProcess(3, 6, 1);
        scheduler.addProcess(4, 8, 3);

        scheduler.simulate();
    }
}
