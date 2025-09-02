package Lambda_Expressions.Custom_Sorting_in_E_Commerce;

import java.util.Arrays;
import java.util.List;

public class ECommerceSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Shoes", 2000, 4.5, 20),
                new Product("Watch", 5000, 4.7, 10),
                new Product("Bag", 1500, 4.2, 30)
        );

        System.out.println("Sort by Price:");
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(System.out::println);

        System.out.println("\nSort by Rating:");
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        products.forEach(System.out::println);

        System.out.println("\nSort by Discount:");
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        products.forEach(System.out::println);
    }
}
