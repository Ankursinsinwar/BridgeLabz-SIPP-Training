package Java_Generics.Smart_Warehouse_Management_System;

public class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("Furniture: " + name);
    }
}