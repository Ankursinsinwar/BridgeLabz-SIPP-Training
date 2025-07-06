package LinkedListProblems;

import java.util.Scanner;

class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketNode next;

    public TicketNode(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservation {
    private TicketNode head = null;
    private TicketNode tail = null;
    private int ticketCounter = 1;

    // Add new reservation at end
    public void addTicket(String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newTicket = new TicketNode(ticketCounter++, customerName, movieName, seatNumber, bookingTime);

        if (head == null) {
            head = tail = newTicket;
            tail.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
        System.out.println("Ticket booked successfully with ID: " + newTicket.ticketId);
    }

    // Remove ticket by ID
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        TicketNode current = head;
        TicketNode prev = tail;
        boolean found = false;

        do {
            if (current.ticketId == ticketId) {
                found = true;
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("Ticket ID " + ticketId + " not found.");
            return;
        }

        if (head == tail && current == head) {
            head = tail = null;
        } else if (current == head) {
            head = head.next;
            tail.next = head;
        } else if (current == tail) {
            tail = prev;
            tail.next = head;
        } else {
            prev.next = current.next;
        }

        System.out.println("Ticket ID " + ticketId + " removed successfully.");
    }

    // Display all current tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode current = head;
        System.out.println("\nCurrent Booked Tickets:");
        do {
            printTicket(current);
            current = current.next;
        } while (current != head);
    }

    // Search by Customer Name
    public void searchByCustomer(String name) {
        boolean found = false;
        TicketNode current = head;
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        do {
            if (current.customerName.equalsIgnoreCase(name)) {
                printTicket(current);
                found = true;
            }
            current = current.next;
        } while (current != head);
        if (!found) {
            System.out.println("No ticket found for customer: " + name);
        }
    }

    // Search by Movie Name
    public void searchByMovie(String movie) {
        boolean found = false;
        TicketNode current = head;
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        do {
            if (current.movieName.equalsIgnoreCase(movie)) {
                printTicket(current);
                found = true;
            }
            current = current.next;
        } while (current != head);
        if (!found) {
            System.out.println("No ticket found for movie: " + movie);
        }
    }

    // Count total tickets
    public void countTickets() {
        if (head == null) {
            System.out.println("Total Booked Tickets: 0");
            return;
        }

        int count = 0;
        TicketNode current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);
        System.out.println("Total Booked Tickets: " + count);
    }

    // Helper: print ticket details
    private void printTicket(TicketNode ticket) {
        System.out.println("Ticket ID: " + ticket.ticketId + " | Customer: " + ticket.customerName + " | Movie: " + ticket.movieName + " | Seat: " + ticket.seatNumber + " | Time: " + ticket.bookingTime);
    }
}


public class TicketReservationSystem {
    public static void main(String[] args) {
        TicketReservation system = new TicketReservation();
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\n--- Online Ticket Reservation Menu ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display All Tickets");
            System.out.println("4. Search by Customer");
            System.out.println("5. Search by Movie");
            System.out.println("6. Total Booked Tickets");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Customer Name: ");
                    String name = sc.nextLine();
                    System.out.print("Movie Name: ");
                    String movie = sc.nextLine();
                    System.out.print("Seat Number: ");
                    String seat = sc.nextLine();
                    System.out.print("Booking Time: ");
                    String time = sc.nextLine();
                    system.addTicket(name, movie, seat, time);
                    break;
                case 2:
                    System.out.print("Enter Ticket ID to cancel: ");
                    int id = sc.nextInt();
                    system.removeTicket(id);
                    break;
                case 3:
                    system.displayTickets();
                    break;
                case 4:
                    System.out.print("Enter customer name: ");
                    system.searchByCustomer(sc.nextLine());
                    break;
                case 5:
                    System.out.print("Enter movie name: ");
                    system.searchByMovie(sc.nextLine());
                    break;
                case 6:
                    system.countTickets();
                    break;
                case 0:
                    running = false;
                    System.out.println("Exiting system.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
