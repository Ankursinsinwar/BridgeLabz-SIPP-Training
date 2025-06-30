package ObjectModeling.Library_And_Books;

public class Main {

    public static void main(String[] args) {
        // Create a library
        Library library = new Library("Fullstatk");

        // Create books
        Book book1 = new Book("HTML", "Tim Berners-Lee");
        Book book2 = new Book("CSS", "Bert Bos");
        Book book3 = new Book("JS", "Brendan Eich");

        // Adding books to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display library and books in it
        library.showBooks();

    }
}
