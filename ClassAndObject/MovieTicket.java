package ClassAndObject;

// Class Definition
public class MovieTicket {

    // Attributes
    private String movieName;
    private String seatNumber;
    private double price;

    // Method to book a ticket
    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to display ticket details
    public void displayDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: Rs. " + price);
    }

    // Main method
    public static void main(String[] args) {

        // create ticket objects
        MovieTicket ticket1 = new MovieTicket();
        MovieTicket ticket2 = new MovieTicket();

        ticket1.bookTicket("Batman", "D4", 250);
        ticket2.bookTicket("Batman", "D5", 250);

        System.out.println("\n=== Ticket 1 Details ===");
        ticket1.displayDetails();
        System.out.println("\n=== Ticket 2 Details ===");
        ticket2.displayDetails();
    }
}
