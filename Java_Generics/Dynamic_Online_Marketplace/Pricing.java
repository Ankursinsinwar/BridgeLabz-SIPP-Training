package Java_Generics.Dynamic_Online_Marketplace;

public class Pricing {
    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        ((IDiscount) product).applyDiscount(percent);
    }
}

