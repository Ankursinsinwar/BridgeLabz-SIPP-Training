package Encapsulation_Polymorphism_Interface_Abstract.LibraryManagementSystem;

class Book extends LibraryItem implements Reservable {
    private boolean reserved = false;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21; // 3 weeks
    }

    @Override
    public void reserveItem(String name) {
        if (!reserved) {
            reserved = true;
            setBorrowerName(name);
            System.out.println("Book reserved by: " + name);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}
