package Encapsulation_Polymorphism_Interface_Abstract.VehicleRentalSystem;

class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}
