package LinkedListProblems;

// Node representing each text state
class TextStateNode {
    String text;
    TextStateNode prev, next;

    public TextStateNode(String text) {
        this.text = text;
    }
}


class TextEditorHistory {
    private final int MAX_HISTORY;
    private TextStateNode head = null;
    private TextStateNode tail = null;
    private TextStateNode current = null;
    private int size = 0;

    public TextEditorHistory(int maxHistory) {
        this.MAX_HISTORY = maxHistory;
    }

    // Add a new text state
    public void addState(String newText) {
        TextStateNode newState = new TextStateNode(newText);

        // If current is not the tail, cut off redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        // Add new state at the end
        if (head == null) {
            head = tail = current = newState;
        } else {
            tail.next = newState;
            newState.prev = tail;
            tail = newState;
            current = newState;
        }

        size++;
        // Limit history size
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo: Move to previous state
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo successful.");
        } else {
            System.out.println("No more undo available.");
        }
    }

    // Redo: Move to next state
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo successful.");
        } else {
            System.out.println("No more redo available.");
        }
    }

    // Get current text state
    public String getCurrentState() {
        return current != null ? current.text : "";
    }

    // Print the whole history (for debugging)
    public void printHistory() {
        TextStateNode temp = head;
        System.out.println("Editor History:");
        while (temp != null) {
            System.out.println("-> " + temp.text + (temp == current ? " (current)" : ""));
            temp = temp.next;
        }
    }
}

public class TextEditorUndoRedo {
    public static void main(String[] args) {
        TextEditorHistory editor = new TextEditorHistory(10); // Max 10 states

        editor.addState("H");
        editor.addState("He");
        editor.addState("Hel");
        editor.addState("Hell");
        editor.addState("Hello");

        System.out.println("\nCurrent Text: " + editor.getCurrentState());

        editor.undo();
        System.out.println("After Undo: " + editor.getCurrentState());

        editor.undo();
        System.out.println("After Undo: " + editor.getCurrentState());

        editor.redo();
        System.out.println("After Redo: " + editor.getCurrentState());

        editor.addState("Hello, World!");
        System.out.println("After New Edit: " + editor.getCurrentState());

        editor.redo(); // Should say no redo available

        editor.printHistory(); // Show internal history
    }
}
