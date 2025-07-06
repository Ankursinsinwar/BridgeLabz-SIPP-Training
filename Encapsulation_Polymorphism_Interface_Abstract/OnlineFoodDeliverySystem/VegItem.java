package Encapsulation_Polymorphism_Interface_Abstract.OnlineFoodDeliverySystem;

class VegItem extends FoodItem implements Discountable {
    private double discount = 0.0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discount);
    }

    @Override
    public void applyDiscount(double percent) {
        this.discount = percent / 100;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Discount: " + (int)(discount * 100) + "%";
    }
}
