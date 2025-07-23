package Java_Generics.Smart_Warehouse_Management_System;

public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(new Electronics("Laptop"));

        groceriesStorage.addItem(new Groceries("Rice"));

        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("Electronics Items:");
        Storage.displayAll(electronicsStorage.getItems());

        System.out.println("\nGrocery Items:");
        Storage.displayAll(groceriesStorage.getItems());

        System.out.println("\nFurniture Items:");
        Storage.displayAll(furnitureStorage.getItems());
    }
}
