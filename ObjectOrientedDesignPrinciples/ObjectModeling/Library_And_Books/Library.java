package  ObjectModeling.Library_And_Books;

import java.util.ArrayList;
import java.util.List;

public class Library{

    String library;
    List<Book> books;

    public Library(String library){
        this.library = library;
        this.books = new ArrayList<>();
    }
    


    public void addBook(Book book) {
        books.add(book);
        System.out.println("\nbook \'" + book.title + "\' Writen by \'" + book.author + "\' has been added to library: " + library);
    }


    public void showBooks() {
        System.out.println("\nbooks present in " + library + " library:");
        for (Book book : books) {
            book.display();
        }
    }
}