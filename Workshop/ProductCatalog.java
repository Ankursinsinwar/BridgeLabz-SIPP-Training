package Workshop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private String category;
    private double price;
    private int stock;

    public static final int MAX_STOCK = 1000;

    public Product(String name, String category, double price, int stock) throws IllegalArgumentException {
        if (stock < 0 || stock > MAX_STOCK) {
            throw new IllegalArgumentException("Stock must be between 0 and " + MAX_STOCK);
        }
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Set stock
    public void updateStock(int newStock) throws IllegalArgumentException {
        if (newStock < 0 || newStock > MAX_STOCK) {
            throw new IllegalArgumentException("Stock must be between 0 and " + MAX_STOCK);
        }
        this.stock = newStock;
    }

    @Override
    public String toString() {
        return String.format("Name: %-15s | Category: %-10s | Price: %.2f  \t| Stock: %d",
                name, category, price, stock);
    }
}

public class ProductCatalog {

    private static List<Product> products = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    // Add new product
    public static void addProduct() {
        try {
            System.out.print("Enter product name: ");
            String name = sc.nextLine();
            System.out.print("Enter category: ");
            String category = sc.nextLine();
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            System.out.print("Enter stock: ");
            int stock = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            products.add(new Product(name, category, price, stock));
            System.out.println("Product added successfully.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter correct data types.");
            sc.nextLine(); // consume invalid input
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Search products by name or category
    public static void searchProduct() {
        System.out.print("Search by (1) Name or (2) Category? ");
        String option = sc.nextLine();

        System.out.print("Enter search keyword: ");
        String keyword = sc.nextLine().toLowerCase();

        boolean found = false;

        for (Product p : products) {
            if ((option.equals("1") && p.getName().toLowerCase().contains(keyword)) ||
                    (option.equals("2") && p.getCategory().toLowerCase().contains(keyword))) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching products found.");
        }
    }

    // Update product stock
    public static void updateStock() {
        System.out.print("Enter product name to update stock: ");
        String name = sc.nextLine();
        Product found = null;

        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                found = p;
                break;
            }
        }

        if (found == null) {
            System.out.println("Product not found.");
            return;
        }

        try {
            System.out.print("Enter new stock value: ");
            int newStock = sc.nextInt();
            sc.nextLine(); // consume newline
            found.updateStock(newStock);
            System.out.println("Stock updated successfully.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
            sc.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Display sorted products
    public static void generateReport() {
        System.out.print("Sort by price (1) Ascending or (2) Descending? ");
        String option = sc.nextLine();

        Comparator<Product> comparator = Comparator.comparingDouble(Product::getPrice);
        if (option.equals("2")) {
            comparator = comparator.reversed();
        }

        products.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }

    // Main menu
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== E-Commerce Product Catalog ===");
            System.out.println("1. Add Product");
            System.out.println("2. Search Product");
            System.out.println("3. Update Stock");
            System.out.println("4. Generate Price Report");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    addProduct();
                    break;
                case "2":
                    searchProduct();
                    break;
                case "3":
                    updateStock();
                    break;
                case "4":
                    generateReport();
                    break;
                case "5":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}