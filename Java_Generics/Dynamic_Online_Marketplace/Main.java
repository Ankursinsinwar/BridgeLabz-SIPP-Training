package Java_Generics.Dynamic_Online_Marketplace;

public class Main {
    public static void main(String[] args) {
        Catalog<Product<?>> catalog = new Catalog<>();

        Product<BookCategory> book = new Product<>("Effective Java", 1000, new BookCategory());
        Product<ClothingCategory> cloth = new Product<>("T-sirt", 200, new ClothingCategory());
        Product<GadgetCategory> gadget = new Product<>("Smart watch", 2000, new GadgetCategory());

        catalog.addProduct(book);
        catalog.addProduct(cloth);
        catalog.addProduct(gadget);

        System.out.println("Before Discount:\n--------------------");
        for (Product<?> b : catalog.getProducts())
            b.display();

        Pricing.applyDiscount(book, 10);
        Pricing.applyDiscount(cloth, 20);
        Pricing.applyDiscount(gadget, 15);

        System.out.println("\nAfter Discount:\n--------------------");
        for (Product<?> b : catalog.getProducts())
            b.display();
    }
}
