package Encapsulation_Polymorphism_Interface_Abstract.ECommercePlatform;

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;  // 5% discount
    }
}
