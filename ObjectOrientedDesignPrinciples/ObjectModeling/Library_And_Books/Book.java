package ObjectModeling.Library_And_Books;

public class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book: " + title + "\t author: " + author); 
    }

}