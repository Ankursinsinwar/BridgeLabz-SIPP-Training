package Encapsulation_Polymorphism_Interface_Abstract.LibraryManagementSystem;

class DVD extends LibraryItem implements Reservable {
    private boolean reserved = false;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }

    @Override
    public void reserveItem(String name) {
        if (!reserved) {
            reserved = true;
            setBorrowerName(name);
            System.out.println("DVD reserved by: " + name);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}
