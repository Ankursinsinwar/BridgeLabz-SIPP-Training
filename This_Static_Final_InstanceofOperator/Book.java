package This_Static_Final_InstanceofOperator;

// class Definition
public class Book {
    private final String isbn;
    private String title;
    private String author;

    static String libraryName = "National Library";

    // Constructor
    public Book(String isbn, String title,String author) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    // Static method
    public static void displayLibraryName() {
        System.out.println("\nLibrary: " + libraryName);
    }

    // Instance method using instanceof
    public void displayBookDetails(Object obj) {
        if (obj instanceof Book) {
            Book b = (Book) obj;
            System.out.println("\nISBN: " + b.isbn);
            System.out.println("Title: " + b.title);
            System.out.println("Author: " + b.author);
        } else {
            System.out.println("Not a valid Book object!");
        }
    }

    // main method
    public static void main(String[] args) {
        // create objects of Book
        Book b1 = new Book("978-0451524935", "1984", "George Orwell");
        Book b2 = new Book("978-0061120084", "To Kill a Mockingbird", "Harper Lee");

        b1.displayBookDetails(b1);
        b2.displayBookDetails(b2);

        // Display library name
        displayLibraryName();
    }
}
