package Java_Generics.Dynamic_Online_Marketplace;

class Product<T extends Category> implements IDiscount{
    protected String name;
    protected double price;
    protected T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }

    // public static <T extends Product<?>> void applyDiscount(T product, double percent) {
    //     product.price -= product.price * (percent / 100);
    // }

    public void display() {
        System.out.println("- " + name + " (" + category.getCategoryName() + ") - Rs. " + price);
    }
}
