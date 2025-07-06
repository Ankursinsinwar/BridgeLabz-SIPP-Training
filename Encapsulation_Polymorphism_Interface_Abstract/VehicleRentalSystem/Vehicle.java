package Encapsulation_Polymorphism_Interface_Abstract.VehicleRentalSystem;

public abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters and Setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String geType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails(int days) {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate (per day): " + rentalRate);
        System.out.println("Rental Cost for " + days + " days: " + calculateRentalCost(days));

        if (this instanceof Insurable) {
            Insurable i = (Insurable) this;
            System.out.println("Insurance Cost: " + i.calculateInsurance());
            System.out.println(i.getInsuranceDetails());
        }
        System.out.println("----------------------------------");
    }
}
