package ClassAndObject;

// class definition
class Item {
    // atributes
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int code, String name, double price) {
        this.itemCode = code;
        this.itemName = name;
        this.price = price;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: Rs. " + price);
    }

    // Method to calculate total cost for given quantity
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Main method
    public static void main(String[] args) {

        // create item object
        Item item = new Item(101, "Pen", 5);
                
        System.out.println("\n=== Item details ===");
        item.displayDetails();
        int quantity = 10;
        System.out.println("Total Cost for " + quantity + " items: Rs. " + item.calculateTotalCost(quantity));
    }
}
