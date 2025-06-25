package Level1;

public class BookBorrow {
    String title;
    String author;
    double price;
    boolean isAvailable = true;

    public BookBorrow(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public static void main(String[] args) {
        BookBorrow book = new BookBorrow("Java Advanced", "Alex", 599.99);
        book.borrowBook();
        book.borrowBook(); // second call to show availability check
    }
}
