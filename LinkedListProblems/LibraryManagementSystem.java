package LinkedListProblems;

// Node class representing a Book
class BookNode {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    BookNode next, prev;

    public BookNode(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

// Doubly Linked List for Library Management
class LibraryList {
    private BookNode head = null;
    private BookNode tail = null;

    // Add book at beginning
    public void addAtBeginning(String title, String author, String genre, int id, boolean status) {
        BookNode newBook = new BookNode(title, author, genre, id, status);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    // Add book at end
    public void addAtEnd(String title, String author, String genre, int id, boolean status) {
        BookNode newBook = new BookNode(title, author, genre, id, status);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    // Add at specific position (1-based index)
    public void addAtPosition(int position, String title, String author, String genre, int id, boolean status) {
        if (position <= 1 || head == null) {
            addAtBeginning(title, author, genre, id, status);
            return;
        }

        BookNode current = head;
        for (int i = 1; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }

        if (current.next == null) {
            addAtEnd(title, author, genre, id, status);
            return;
        }

        BookNode newBook = new BookNode(title, author, genre, id, status);
        newBook.next = current.next;
        newBook.prev = current;
        current.next.prev = newBook;
        current.next = newBook;
    }

    // Remove book by ID
    public void removeByBookId(int id) {
        BookNode current = head;
        while (current != null && current.bookId != id) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Book with ID " + id + " not found.");
            return;
        }

        if (current == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (current == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
            else head = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        System.out.println("Book with ID " + id + " removed.");
    }

    // Search by Title
    public void searchByTitle(String title) {
        boolean found = false;
        BookNode current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                printBook(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No book found with title: " + title);
    }

    // Search by Author
    public void searchByAuthor(String author) {
        boolean found = false;
        BookNode current = head;
        while (current != null) {
            if (current.author.equalsIgnoreCase(author)) {
                printBook(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No books found by author: " + author);
    }

    // Update availability
    public void updateAvailability(int id, boolean status) {
        BookNode current = head;
        while (current != null) {
            if (current.bookId == id) {
                current.isAvailable = status;
                System.out.println("Availability updated for book ID: " + id);
                return;
            }
            current = current.next;
        }
        System.out.println("Book ID not found: " + id);
    }

    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        System.out.println("Books in Library (Forward):");
        BookNode current = head;
        System.out.print("[Head]");
        while (current != null) {
            printBook(current);
            if (current == tail) {
                System.out.print("[Tail]");
            }
            current = current.next;
            System.out.print("<--->");
        }
        System.out.println(" null");
    }

    // Display reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }

        System.out.println("Books in Library (Reverse):");
        BookNode current = tail;
       System.out.print("[Tail]");
        while (current != null) {
            printBook(current);
            if (current == head) {
                System.out.print("[Head]");
            }
            current = current.prev;
            System.out.print("<--->");

        }
        System.out.println(" null");
    }

    // Count total books
    public void countBooks() {
        int count = 0;
        BookNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Total number of books: " + count);
    }

    // Print a book
    private void printBook(BookNode book) {
        System.out.print(" [Book ID: " + book.bookId + " | Title: " + book.title + " | Author: " + book.author + " | Genre: " + book.genre + " | Available: " + (book.isAvailable ? "Yes" : "No") + "] ");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryList library = new LibraryList();

        // Add sample books
        library.addAtBeginning("1984", "George Orwell", "Dystopian", 101, true);
        library.addAtEnd("The Alchemist", "Paulo Coelho", "Fiction", 102, false);
        library.addAtPosition(2, "To Kill a Mockingbird", "Harper Lee", "Classic", 103, true);

        // Display
        System.out.println("\n-- Library Forward --");
        library.displayForward();

        System.out.println("\n-- Library Reverse --");
        library.displayReverse();

        System.out.println("\n-- Count Books --");
        library.countBooks();

        System.out.println("\n-- Search by Title --");
        library.searchByTitle("1984");

        System.out.println("\n-- Search by Author --");
        library.searchByAuthor("Harper Lee");

        System.out.println("\n-- Update Availability --");
        library.updateAvailability(102, true);

        System.out.println("\n-- Remove Book by ID --");
        library.removeByBookId(101);

        System.out.println("\n-- Library After Removal --");
        library.displayForward();
    }
}
