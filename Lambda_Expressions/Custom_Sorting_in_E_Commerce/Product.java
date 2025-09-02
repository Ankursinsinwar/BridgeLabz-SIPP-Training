package Lambda_Expressions.Custom_Sorting_in_E_Commerce;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " [Price=" + price + ", Rating=" + rating + ", Discount=" + discount + "%]";
    }
}