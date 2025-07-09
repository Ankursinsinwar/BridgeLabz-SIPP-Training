package Stack_Queue_HashMap_Hashing_Function.StacksAndQueues;

import java.util.Iterator;
import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> inQStack = new Stack<>();
    Stack<Integer> deQStack = new Stack<>();

    public void enqueue(int x) {
        System.out.println("enqueue: " + x);
        inQStack.push(x);
    }

    public int dequeue() {
        if (deQStack.isEmpty()) {
            while (!inQStack.isEmpty()) {
                deQStack.push(inQStack.pop());
            }
        }
        return deQStack.isEmpty() ? -1 : deQStack.pop();

    }

    public boolean isEmpty() {
        return inQStack.isEmpty() && deQStack.isEmpty();
    }

    public void show() {
        System.out.print("Queue: [");

        // First print elements in dqQStack stack (top to bottom)
        Iterator<Integer> outItr = deQStack.iterator();
        Stack<Integer> tempOut = new Stack<>();
        while (outItr.hasNext()) {
            tempOut.push(outItr.next());
        }
        for (int i = tempOut.size() - 1; i >= 0; i--) {
            System.out.print(tempOut.get(i));
            if (i > 0 || !inQStack.isEmpty()) System.out.print(", ");
        }

        // Then print elements in inQStack stack (bottom to top)
        for (int i = 0; i < inQStack.size(); i++) {
            System.out.print(inQStack.get(i));
            if (i < inQStack.size() - 1) System.out.print(", ");
        }

        System.out.println("]");
    }



    
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.show();

        System.out.println("Dequeue: " + queue.dequeue()); // 10
        queue.show();
        queue.enqueue(40);
        queue.show();
        System.out.println("Dequeue: " + queue.dequeue()); // 20
        System.out.println("Dequeue: " + queue.dequeue()); // 30
        queue.show();
        System.out.println("Dequeue: " + queue.dequeue()); // 40
        queue.show();
        System.out.println("Dequeue: " + queue.dequeue()); // -1 or error
    }
}
