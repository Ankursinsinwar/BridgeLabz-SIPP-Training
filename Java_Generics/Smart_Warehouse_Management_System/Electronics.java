package Java_Generics.Smart_Warehouse_Management_System;

public class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("Electronics: " + name);
    }
}