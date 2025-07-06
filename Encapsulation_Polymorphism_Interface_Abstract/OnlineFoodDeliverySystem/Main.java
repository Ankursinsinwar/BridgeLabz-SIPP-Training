package Encapsulation_Polymorphism_Interface_Abstract.OnlineFoodDeliverySystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FoodItem> orderList = new ArrayList<>();

        VegItem veg1 = new VegItem("Paneer Tikka", 150, 2);
        NonVegItem nonveg1 = new NonVegItem("Chicken Biryani", 200, 1);

        veg1.applyDiscount(10);       // 10% off
        nonveg1.applyDiscount(15);     // 5% off

        orderList.add(veg1);
        orderList.add(nonveg1);

        processOrder(orderList);
    }

    public static void processOrder(ArrayList<FoodItem> items) {
        double grandTotal = 0.0;
        System.out.println("----- Order Summary -----");
        for (FoodItem item : items) {
            item.getItemDetails();

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println(d.getDiscountDetails());
            }

            grandTotal += item.calculateTotalPrice();
            System.out.println("-------------------------");
        }
        System.out.println("Grand Total: Rs. " + grandTotal);
    }
}

