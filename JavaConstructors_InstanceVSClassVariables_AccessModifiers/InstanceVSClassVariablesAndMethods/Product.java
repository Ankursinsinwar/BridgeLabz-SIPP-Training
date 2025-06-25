package InstanceVSClassVariablesAndMethods;

// Class Definition
public class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    public Product(String name, double price) {
        this.productName = name;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: ₹" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Mouse", 599.99);
        Product p2 = new Product("Keyboard", 999.99);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}
