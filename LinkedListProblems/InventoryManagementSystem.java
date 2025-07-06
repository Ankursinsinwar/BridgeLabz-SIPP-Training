package LinkedListProblems;

// Node representing an inventory item
class ItemNode {
    String itemName;
    int itemId;
    int quantity;
    double price;
    ItemNode next;

    public ItemNode(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

// Singly Linked List for Inventory Management
class InventoryList {
    private ItemNode head;

    // Add item at beginning
    public void addAtBeginning(String name, int id, int quantity, double price) {
        ItemNode newNode = new ItemNode(name, id, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    // Add item at end
    public void addAtEnd(String name, int id, int quantity, double price) {
        ItemNode newNode = new ItemNode(name, id, quantity, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Add item at specific position (1-based index)
    public void addAtPosition(int pos, String name, int id, int quantity, double price) {
        if (pos <= 1 || head == null) {
            addAtBeginning(name, id, quantity, price);
            return;
        }

        ItemNode newNode = new ItemNode(name, id, quantity, price);
        ItemNode current = head;
        for (int i = 1; i < pos - 1 && current.next != null; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Remove item by ID
    public void removeById(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        ItemNode current = head;
        while (current.next != null && current.next.itemId != id) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Item with ID " + id + " not found.");
        }
    }

    // Update quantity by ID
    public void updateQuantity(int id, int newQuantity) {
        ItemNode current = head;
        while (current != null) {
            if (current.itemId == id) {
                current.quantity = newQuantity;
                System.out.println("Quantity updated.");
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found.");
    }

    // Search by ID
    public void searchById(int id) {
        ItemNode current = head;
        while (current != null) {
            if (current.itemId == id) {
                printItem(current);
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found.");
    }

    // Search by Name
    public void searchByName(String name) {
        ItemNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.itemName.equalsIgnoreCase(name)) {
                printItem(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("Item not found.");
    }

    // Display all items
    public void displayAll() {
        if (head == null) {
            System.out.println("No items in inventory.");
            return;
        }
        ItemNode current = head;
        System.out.print("[Head]");
        while (current != null) {
            printItem(current);
            current = current.next;
            System.out.print("--->");
        }
        System.out.println(" null");
    }

    // Calculate total inventory value
    public void calculateTotalValue() {
        double total = 0;
        ItemNode current = head;
        while (current != null) {
            total += current.price * current.quantity;
            current = current.next;
        }
        System.out.println("Total Inventory Value: Rs. " + total);
    }

    // Sort by Item Name or Price
    public void sortInventory(String key, boolean ascending) {
        head = mergeSort(head, key, ascending);
        System.out.println("Inventory sorted by " + key + " (" + (ascending ? "Ascending" : "Descending") + ")");
    }

    // Merge Sort implementation
    private ItemNode mergeSort(ItemNode head, String key, boolean ascending) {
        if (head == null || head.next == null) return head;

        ItemNode middle = getMiddle(head);
        ItemNode nextOfMiddle = middle.next;
        middle.next = null;

        ItemNode left = mergeSort(head, key, ascending);
        ItemNode right = mergeSort(nextOfMiddle, key, ascending);

        return sortedMerge(left, right, key, ascending);
    }

    private ItemNode sortedMerge(ItemNode a, ItemNode b, String key, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (key.equalsIgnoreCase("name")) {
            condition = ascending ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                                  : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } else {
            condition = ascending ? a.price <= b.price : a.price > b.price;
        }

        if (condition) {
            a.next = sortedMerge(a.next, b, key, ascending);
            return a;
        } else {
            b.next = sortedMerge(a, b.next, key, ascending);
            return b;
        }
    }

    private ItemNode getMiddle(ItemNode head) {
        if (head == null) return head;
        ItemNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Helper to print item
    private void printItem(ItemNode item) {
        System.out.print(" [Item ID: " + item.itemId + " | Name: " + item.itemName + " | Quantity: " + item.quantity + " | Price: Rs. " + item.price + "] ");
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryList inventory = new InventoryList();

        // Sample data
        inventory.addAtEnd("Mouse", 101, 50, 250.0);
        inventory.addAtBeginning("Keyboard", 102, 30, 550.0);
        inventory.addAtPosition(2, "Monitor", 103, 20, 7000.0);

        System.out.println("\n-- Inventory List --");
        inventory.displayAll();

        System.out.println("\n-- Total Inventory Value --");
        inventory.calculateTotalValue();

        System.out.println("\n-- Search by ID (103) --");
        inventory.searchById(103);

        System.out.println("\n-- Update Quantity (ID 101 to 70) --");
        inventory.updateQuantity(101, 70);
        inventory.searchById(101);

        System.out.println("\n-- Sort by Name Ascending --");
        inventory.sortInventory("name", true);
        inventory.displayAll();

        System.out.println("\n-- Sort by Price Descending --");
        inventory.sortInventory("price", false);
        inventory.displayAll();
    }
}
