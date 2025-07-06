package Encapsulation_Polymorphism_Interface_Abstract.OnlineFoodDeliverySystem;

class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0.0;
    private final double nonVegCharge = 30.0; // Extra charge per item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double base = (getPrice() + nonVegCharge) * getQuantity();
        return base - (base * discount);
    }

    @Override
    public void applyDiscount(double percent) {
        this.discount = percent / 100;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Discount: " + (int)(discount * 100) + "%, Extra Charge: Rs. 30/item";
    }
}

