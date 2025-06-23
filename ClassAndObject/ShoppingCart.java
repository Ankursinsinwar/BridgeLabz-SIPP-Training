package ClassAndObject;

import java.util.ArrayList;
import java.util.Scanner;

// class definition
public class ShoppingCart {

    // Atribute for ShopingCart class
    private ArrayList<CartItem> cartItems;

    static class CartItem {
        // Atributes for CartItem subclass
        private String itemName;
        private double price;
        private int quantity;

        // costructure
        public CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        // getter for name
        public String getItemName() {
            return itemName;
        }
        
        // getter for total cost
        public double getTotalCost() {
            return price * quantity;
        }

        // method to display item details
        public void displayItem() {
            System.out.println(itemName + " - Rs. " + price + " x " + quantity + " = Rs. " + getTotalCost()); 
        }
    }
    

    public ShoppingCart() {

        // create cartItems array object
        cartItems = new ArrayList<>();
    }

    // method to additem
    public void addItem(String itemName, double price, int quantity) {
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println(itemName + " added to cart.");
    }

    // method to remove item
    public void removeItem(String itemName) {
        boolean removed = false;
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getItemName().equalsIgnoreCase(itemName)) {
                cartItems.remove(i);
                System.out.println(itemName + " removed from cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Item not found in cart.");
        }
    }

    // method to display cart details
    public void displayCart() {
        double total = 0;
        System.out.println("\n=== Your Shopping Cart ===");
        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (CartItem item : cartItems) {
                item.displayItem();
                total += item.getTotalCost();
            }
            System.out.println("Total Cost: Rs. " + total);
        }
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create cart object
        ShoppingCart cart = new ShoppingCart();

        int choice;
        do {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Cart");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    cart.addItem(name, price, qty);
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = sc.nextLine();
                    cart.removeItem(removeName);
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    System.out.println("Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
