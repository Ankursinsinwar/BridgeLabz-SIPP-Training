package Level1;

public class Book {
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // main method
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("An autobiography", "Jawahar Lal Nehru" , 499.99);

        System.out.println("Book 1: " + b1.title + ", " + b1.author + ", " + b1.price);
        System.out.println("Book 2: " + b2.title + ", " + b2.author + ", " + b2.price);
    }
}
