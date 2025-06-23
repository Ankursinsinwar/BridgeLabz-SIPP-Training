package ClassAndObject;

// Class Definition 
public class MobilePhone {

    // Atributes
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    // Main method
    public static void main(String[] args) {

        // create mobile phone objects
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 79999);
        MobilePhone phone2 = new MobilePhone("Techno", "POVA 13", 18000);


        System.out.println("\n===  phone 1 ==="); 
        phone1.displayDetails();
        System.out.println("\n===  phone 2 ==="); 
        phone2.displayDetails();
    }
}
