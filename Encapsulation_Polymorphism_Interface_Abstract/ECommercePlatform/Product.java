package Encapsulation_Polymorphism_Interface_Abstract.ECommercePlatform;

abstract class Product {

    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();

    public void displayFinalPrice() {
        double discount = calculateDiscount();
        double tax; 

        if (this instanceof Taxable) { 
            tax = ((Taxable) this).calculateTax();
        } else {
            tax = 0.0;
        }
        
        double finalPrice = price + tax - discount;

        System.out.println("Product: " + name);
        System.out.println("Base Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);
        if (this instanceof Taxable) {
            System.out.println(((Taxable) this).getTaxDetails());
        }
        System.out.println("---------------------------");
    }
}
