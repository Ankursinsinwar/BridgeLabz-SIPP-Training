package Encapsulation_Polymorphism_Interface_Abstract.ECommercePlatform;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();

        Product laptop = new Electronics(101, "Laptop", 60000);
        Product shirt = new Clothing(102, "Shirt", 2000);
        Product apple = new Groceries(103, "Apples", 100);

        cart.add(laptop);
        cart.add(shirt);
        cart.add(apple);

        for (Product product : cart) {
            product.displayFinalPrice();
        }
    }
}

