package Inheritance.Single_Inheritance;

// SUperClass
class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Book: " + title + "\nPublication year: " + publicationYear);
    }
}

// Author subclass
class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Author: " + name + ",\n Bio: " + bio + "");
        System.out.println("----------------------");
    }

}

public class Library {
    public static void main(String[] args) {
        Book b1 = new Author("Harry Potter", 1997, "J. K. Rowling"," JK Rowling is a British author and philanthropist.\n\t She is the author of Harry Potter, a seven-volume fantasy novel series published from 1997 to 2007");
        Book b2 = new Author("Game of Thrones", 2011, "George R.R. Martin"," George Raymond Martin also known by the initials G.R.R.M \n\tis an American author, television writer, and television producer.");

        b1.displayInfo();
        b2.displayInfo();

    }
}
