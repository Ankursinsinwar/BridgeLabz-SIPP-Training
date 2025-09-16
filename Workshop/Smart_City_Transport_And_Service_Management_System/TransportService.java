package Workshop.Smart_City_Transport_And_Service_Management_System;

public interface TransportService {
    String getName();
    double getFare();
    boolean isActive();

    default void printServiceDetails() {
        System.out.println(getName() + " | Fare: Rs. " + getFare() + " | Active=" + isActive());
    }
}
