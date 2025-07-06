package Encapsulation_Polymorphism_Interface_Abstract.LibraryManagementSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LibraryItem> items = new ArrayList<>();

        LibraryItem book1 = new Book("B001", "Java Programming", "James Gosling");
        LibraryItem magazine1 = new Magazine("M001", "Time Weekly", "Various");
        LibraryItem dvd1 = new DVD("D001", "Inception", "Christopher Nolan");

        items.add(book1);
        items.add(magazine1);
        items.add(dvd1);

        // Polymorphism in action
        for (LibraryItem item : items) {
            item.getItemDetails();

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Available: " + reservable.checkAvailability());
                reservable.reserveItem("Ankur");
                System.out.println("Available after reservation: " + reservable.checkAvailability());
            }

            System.out.println("-----------------------------------");
        }
    }
}
