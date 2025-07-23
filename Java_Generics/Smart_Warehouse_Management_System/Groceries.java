package Java_Generics.Smart_Warehouse_Management_System;

public class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("Grocery: " + name);
    }
}