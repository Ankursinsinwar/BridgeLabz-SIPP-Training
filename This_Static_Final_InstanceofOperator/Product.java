package This_Static_Final_InstanceofOperator;

// class Definition
public class Product {
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    static double discount = 10.0; // percent

    // Constructor
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Instance method using instanceof
    public void displayProductDetails(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            System.out.println("\nProduct ID: " + p.productID);
            System.out.println("Name: " + p.productName);
            System.out.println("Price: Rs. " + p.price);
            System.out.println("Quantity: " + p.quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Tota price Rs. " + (price - (discount * price / 100)) * quantity);
        } else {
            System.out.println("Invalid Product object.");
        }
    }

    // main method
    public static void main(String[] args) {
        // create objects of Product
        Product p1 = new Product("P002", "Headphones", 1500, 2);
        Product p2 = new Product("P001", "Laptop", 90000, 1);

        p1.displayProductDetails(p1);
        
        // update Discount
        Product.updateDiscount(15.0);
        System.out.println("\n === Updated discount ===");
        
        p2.displayProductDetails(p2);

    }
}
