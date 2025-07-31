package Java_Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Comparator;

public class ShoppingCart {

    // Product database (Product -> Price)
    private static HashMap<String, Double> productPriceMap = new HashMap<>();

    // Cart in insertion order (Product -> Quantity)
    private LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();

    // Add product to price list
    public static void addProductPrice(String product, double price) {
        productPriceMap.put(product, price);
    }

    // Add product to cart
    public void addToCart(String product, int quantity) {
        if (productPriceMap.containsKey(product)) {
            cart.put(product, cart.getOrDefault(product, 0) + quantity);
        } else {
            System.out.println("Product not found : " + product);
        }
    }

    // Display cart in insertion order
    public void displayCartInOrder() {
        System.out.println("\nCart in insertion order : ");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            double price = productPriceMap.get(product);
            System.out.println(product + " - Quantity : " + quantity + ", Unit Price : Rs." + price);
        }
    }

    // Display cart sorted by price
    public void displayCartSortedByPrice() {
        // TreeMap with custom comparator to sort by product price
        TreeMap<String, Integer> sortedByPrice = new TreeMap<>(Comparator.comparingDouble(productPriceMap::get));

        sortedByPrice.putAll(cart);

        System.out.println("\nCart sorted by product price : ");
        for (Map.Entry<String, Integer> entry : sortedByPrice.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            double price = productPriceMap.get(product);
            System.out.println(product + " - Quantity : " + quantity + ", Unit Price : Rs." + price);
        }
    }

    // Calculate total bill
    public void displayTotalBill() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            double price = productPriceMap.get(product);
            total += quantity * price;
        }
        System.out.println("\nTotal Bill : Rs." + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart myCart = new ShoppingCart();

        addProductPrice("Milk", 40.0);
        addProductPrice("Bread", 25.0);
        addProductPrice("Butter", 60.0);
        addProductPrice("Eggs", 5.0);
        addProductPrice("Rice", 70.0);

        System.out.println("Enter number of items to add to cart : ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter product name : ");
            String product = sc.nextLine();

            System.out.print("Enter quantity : ");
            int quantity = sc.nextInt();
            sc.nextLine();

            myCart.addToCart(product, quantity);
        }

        myCart.displayCartInOrder();
        myCart.displayCartSortedByPrice();
        myCart.displayTotalBill();
        sc.close();
    }
}