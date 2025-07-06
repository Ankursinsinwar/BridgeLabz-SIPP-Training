package Encapsulation_Polymorphism_Interface_Abstract.OnlineFoodDeliverySystem;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters (Encapsulation)
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    // Setters (Restricted access)
    protected void setQuantity(int quantity) {
        if (quantity > 0) this.quantity = quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Unit Price: Rs. " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: Rs. " + calculateTotalPrice());
    }
}
