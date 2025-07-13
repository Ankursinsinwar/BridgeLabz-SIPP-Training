package SortingAlgorithms;

import java.util.Scanner;

public class ProductPriceSorter {

    static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }
    }

    public void quickSort(Product[] products, int low, int high) {
        if (low < high) {
            int pi = partition(products, low, high);
            quickSort(products, low, pi - 1);
            quickSort(products, pi + 1, high);
        }
    }

    private int partition(Product[] arr, int low, int high) {
        double pivot = arr[high].getPrice();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].getPrice() <= pivot) {
                i++;
                Product temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Product temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public void display(Product[] products) {
        System.out.println("\nProducts sorted by price:");
        for (Product product : products) {
            System.out.println(product.getName() + " - Rs. " + product.getPrice());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductPriceSorter sorter = new ProductPriceSorter();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of product " + (i + 1) + ": ");
            String name = sc.nextLine();

            System.out.print("Enter price of \"" + name + "\": ");
            double price = sc.nextDouble();
            sc.nextLine();

            products[i] = new Product(name, price);
        }

        sorter.quickSort(products, 0, n - 1);
        sorter.display(products);
        sc.close();
    }
}
