package LinkedListProblems;

// Node class for Movie
class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode next, prev;

    public MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

// Doubly Linked List implementation
class MovieDoublyLinkedList {
    private MovieNode head;
    private MovieNode tail;

    // Add movie at beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add movie at end
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add at specific position (1-based index)
    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 1 || head == null) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode current = head;
        for (int i = 1; current != null && i < position - 1; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
    }

    // Remove movie by title
    public void removeByTitle(String title) {
        MovieNode current = head;
        while (current != null && !current.title.equalsIgnoreCase(title)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Movie not found.");
            return;
        }

        if (current == head) {
            head = head.next;
            if (head != null)
                head.prev = null;
            else
                tail = null;
        } else if (current == tail) {
            tail = tail.prev;
            if (tail != null)
                tail.next = null;
            else
                head = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        System.out.println("Movie \"" + title + "\" removed.");
    }

    // Search by Director
    public void searchByDirector(String director) {
        boolean found = false;
        MovieNode current = head;
        while (current != null) {
            if (current.director.equalsIgnoreCase(director)) {
                printMovie(current);
                found = true;
            }
            current = current.next;
        }
        if (!found)
            System.out.println("No movies found by director: " + director);
    }

    // Search by Rating
    public void searchByRating(double rating) {
        boolean found = false;
        MovieNode current = head;
        while (current != null) {
            if (current.rating == rating) {
                printMovie(current);
                found = true;
            }
            current = current.next;
        }
        if (!found)
            System.out.println("No movies found with rating: " + rating);
    }

    // Update movie rating by title
    public void updateRating(String title, double newRating) {
        MovieNode current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                System.out.println("Rating updated for movie: " + title);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found: " + title);
    }

    // Display movies forward
    public void displayForward() {
        if (head == null) {
            System.out.println("No movies in the list.");
            return;
        }
        System.out.println("Movies (Forward):");
        MovieNode current = head;
        System.out.print("[Head]");
        while (current != null) {
            printMovie(current);
            if (current == tail) {
                System.out.print("[Tail]");
            }
            current = current.next;
            System.out.print("<--->");
        }
        System.out.println(" null");
    }

    // Display movies in reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies in the list.");
            return;
        }
        System.out.println("Movies (Reverse):");
        MovieNode current = tail;
        System.out.print("[Tail]");
        while (current != null) {
            printMovie(current);
            if (current == head) {
                System.out.print("[Head]");
            }
            current = current.prev;
            System.out.print("<--->");

        }
        System.out.println(" null");
    }

    // Print a single movie
    private void printMovie(MovieNode m) {
        System.out.print(" [Title: " + m.title + " | Director: " + m.director + " | Year: " + m.year + " | Rating: " + m.rating + "] ");
    }
}

// Main class to test
public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        // Sample operations
        list.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        list.addAtBeginning("The Godfather", "Francis Ford Coppola", 1972, 9.2);
        list.addAtPosition(2, "Interstellar", "Christopher Nolan", 2014, 8.6);
        list.displayForward();

        System.out.println("\n--- Search by Director ---");
        list.searchByDirector("Christopher Nolan");

        System.out.println("\n--- Update Rating ---");
        list.updateRating("Interstellar", 9.0);

        System.out.println("\n--- Remove by Title ---");
        list.removeByTitle("The Godfather");

        System.out.println("\n--- Forward Display ---");
        list.displayForward();

        System.out.println("\n--- Reverse Display ---");
        list.displayReverse();
    }
}
