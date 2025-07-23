package Java_Generics.Dynamic_Online_Marketplace;

import java.util.ArrayList;
import java.util.List;

class Catalog<T extends Product<?>> {
    List<T> products = new ArrayList<>();

    void addProduct(T product) {
        products.add(product);
    }

    List<T> getProducts() {
        return products;
    }
}
