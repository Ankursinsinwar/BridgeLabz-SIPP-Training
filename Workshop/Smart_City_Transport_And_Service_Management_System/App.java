package Workshop.Smart_City_Transport_And_Service_Management_System;

import java.util.*;
import java.util.stream.*;

public class App {
    public static void main(String[] args) {
        List<TransportService> services = Arrays.asList(
            new BusService("City Bus", 15.0, true),
            new MetroService("Blue Line", 25.0, true),
            new TaxiService("Cab Prime", 50.0, true),
            new BusService("Old Town Bus", 12.0, false),
            new AmbulanceService("MedAid-7", 0.0, true),
            new FerryService("River Ferry", 20.0, true)
        );

        FareCalculator calculator = (service, distance, passengers) ->
            service.getFare() + (distance * 2.0) + (passengers - 1);

        System.out.println("-- Booking Options --");
        services.stream()
                .filter(TransportService::isActive)
                .filter(s -> !(s instanceof EmergencyService))
                .sorted(Comparator.comparingDouble(TransportService::getFare))
                .forEach(s -> {
                    double estFare = calculator.calculateFare(s, 10, 2);
                    System.out.println(s.getName() + " | Est Fare ₹" + estFare);
                });

        System.out.println("\n-- Live Dashboard --");
        services.stream()
                .filter(TransportService::isActive)
                .forEach(TransportService::printServiceDetails);

        System.out.println("\n-- Revenue Report --");
        double totalRevenue = services.stream()
                .mapToDouble(TransportService::getFare)
                .sum();
        System.out.println("Total Revenue: ₹" + totalRevenue);

        Map<String, List<TransportService>> byType =
                services.stream().collect(Collectors.groupingBy(s -> s.getClass().getSimpleName()));
        byType.forEach((type, list) ->
            System.out.println(type + ": " + list.size() + " services")
        );

        Map<Boolean, List<TransportService>> partition =
                services.stream().collect(Collectors.partitioningBy(s -> s.getFare() > 20));
        System.out.println("Peak Services: " + partition.get(true).size());
        System.out.println("Non-Peak Services: " + partition.get(false).size());

        System.out.println("\n-- Emergency Services --");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(TransportService::printServiceDetails);

        double dist = GeoUtils.calculateDistance(28.47, 77.09, 28.46, 77.06);
        System.out.println("\nDistance Example: " + dist + " km");
    }
}
