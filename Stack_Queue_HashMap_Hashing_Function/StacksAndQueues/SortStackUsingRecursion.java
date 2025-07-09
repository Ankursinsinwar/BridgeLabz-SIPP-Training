package Stack_Queue_HashMap_Hashing_Function.StacksAndQueues;

import java.util.Stack;

public class SortStackUsingRecursion {

    public static void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sort(stack);
            insertInSortedOrder(stack, top);
        }
    }

    private static void insertInSortedOrder(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
        } else {
            int temp = stack.pop();
            insertInSortedOrder(stack, value);
            stack.push(temp);
        }
    }

    public static void show(Stack<Integer> stack) {
        for (int val : stack) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);

        System.out.print("Original Stack: ");
        show(stack);

        sort(stack);

        System.out.print("Sorted Stack: ");
        show(stack);
    }
}



