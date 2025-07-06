package Encapsulation_Polymorphism_Interface_Abstract.RideHailingApplication;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> rides = new ArrayList<>();

        Car car = new Car("C001", "Anil Kumar", 12.0, "MG Road");
        Bike bike = new Bike("B101", "Rahul Singh", 8.0, "BTM Layout");
        Auto auto = new Auto("A501", "Suresh Reddy", 10.0, "Indiranagar");

        rides.add(car);
        rides.add(bike);
        rides.add(auto);

        double tripDistance = 5.0; // in km

        System.out.println("----- Ride Fare Summary -----");
        for (Vehicle v : rides) {

            v.getVehicleDetails();
            double fare = v.calculateFare(tripDistance);
            System.out.println("Trip Distance: " + tripDistance + " km");
            System.out.println("Total Fare: Rs. " + fare);

            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("Customer Drop Point");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }

            System.out.println("----------------------------------");
        }
    }
}
