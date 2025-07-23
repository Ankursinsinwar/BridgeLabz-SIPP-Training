package Java_Generics.Smart_Warehouse_Management_System;

abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    abstract void display();
}