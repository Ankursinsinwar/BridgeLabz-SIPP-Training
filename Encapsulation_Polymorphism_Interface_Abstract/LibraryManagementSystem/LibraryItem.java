package Encapsulation_Polymorphism_Interface_Abstract.LibraryManagementSystem;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrowerName; // Encapsulated personal data

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters and Setters (Encapsulation)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Sensitive info: borrower
    public void setBorrowerName(String name) {
        this.borrowerName = name;
    }

    public String getBorrowerName() {
        return "[PRIVATE]";
    } // Hide sensitive info

    // Abstract method
    public abstract int getLoanDuration(); // in days

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }
}
