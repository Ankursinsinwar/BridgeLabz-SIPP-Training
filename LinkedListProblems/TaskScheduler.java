package LinkedListProblems;

// Node class for Task
class TaskNode {
    int taskId;
    String taskName;
    String priority;
    String dueDate;
    TaskNode next;

    public TaskNode(int taskId, String taskName, String priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

// Circular Linked List for Task Scheduler
class CircularTaskList {
    private TaskNode head = null;
    private TaskNode tail = null;
    private TaskNode current = null;  // For task rotation

    // Add task at beginning
    public void addAtBeginning(int id, String name, String priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    // Add task at end
    public void addAtEnd(int id, String name, String priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Add task at specific position (1-based index)
    public void addAtPosition(int position, int id, String name, String priority, String dueDate) {
        if (position <= 1 || head == null) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        TaskNode temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == tail) {
            tail = newNode;
        }
    }

    // Remove a task by Task ID
    public void removeById(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode temp = head, prev = null;
        do {
            if (temp.taskId == taskId) {
                if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                    if (temp == tail) {
                        tail = prev;
                    }
                }

                // If current was pointing to this task, move it
                if (current == temp) {
                    current = temp.next;
                }

                // Special case: only one node
                if (head == tail && head.taskId == taskId) {
                    head = tail = current = null;
                }

                System.out.println("Task ID " + taskId + " removed.");
                return;
            }

            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task ID not found: " + taskId);
    }

    // View current task
    public void viewCurrentTask() {
        if (current == null) {
            current = head;
        }

        if (current != null) {
            System.out.println("Current Task:");
            printTask(current);
        } else {
            System.out.println("No tasks available.");
        }
    }

    // Move to next task
    public void moveToNextTask() {
        if (current == null) {
            current = head;
        } else {
            current = current.next;
        }

        viewCurrentTask();
    }

    // Search for tasks by Priority
    public void searchByPriority(String priority) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        boolean found = false;
        TaskNode temp = head;
        do {
            if (temp.priority.equalsIgnoreCase(priority)) {
                printTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority: " + priority);
        }
    }

    // Display all tasks from head
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }

        System.out.println("All Tasks:");
        TaskNode temp = head;
        do {
            printTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Print a task
    private void printTask(TaskNode task) {
        System.out.println("Task ID: " + task.taskId + ", Name: " + task.taskName + ", Priority: " + task.priority + ", Due Date: " + task.dueDate);
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        CircularTaskList taskList = new CircularTaskList();

        // Add sample tasks
        taskList.addAtEnd(1, "Task A", "High", "2025-07-10");
        taskList.addAtBeginning(2, "Task B", "Medium", "2025-07-09");
        taskList.addAtPosition(2, 3, "Task C", "Low", "2025-07-12");

        // Display all tasks
        taskList.displayAllTasks();

        // View current and move through tasks
        System.out.println("\n-- Current Task --");
        taskList.viewCurrentTask();

        System.out.println("\n-- Next Task --");
        taskList.moveToNextTask();

        System.out.println("\n-- Search by Priority: High --");
        taskList.searchByPriority("High");

        System.out.println("\n-- Remove Task ID 2 --");
        taskList.removeById(2);

        System.out.println("\n-- All Tasks After Deletion --");
        taskList.displayAllTasks();
    }
}

