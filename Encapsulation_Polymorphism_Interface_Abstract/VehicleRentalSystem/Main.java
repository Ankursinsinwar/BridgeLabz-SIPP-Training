package Encapsulation_Polymorphism_Interface_Abstract.VehicleRentalSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> fleet = new ArrayList<>();

        Vehicle car = new Car("UP85AB1234", 2000, "CAR123INS");
        Vehicle bike = new Bike("UP85BN3680", 500);
        Vehicle truck = new Truck("KA03TR9876", 4500, "TRK456INS");

        fleet.add(car);
        fleet.add(bike);
        fleet.add(truck);

        int rentalDays = 5;

        for (Vehicle vehicle : fleet) {
            vehicle.displayDetails(rentalDays);
        }
    }
}
