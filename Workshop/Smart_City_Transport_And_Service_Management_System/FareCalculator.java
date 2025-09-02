package Workshop.Smart_City_Transport_And_Service_Management_System;

@FunctionalInterface
public interface FareCalculator {
    double calculateFare(TransportService service, double distanceKm, int passengers);
}
