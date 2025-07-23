package Java_Generics.Smart_Warehouse_Management_System;

import java.util.ArrayList;
import java.util.List;

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    List<T> getItems() {
        return items;
    }

    static void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.display();
        }
    }
}