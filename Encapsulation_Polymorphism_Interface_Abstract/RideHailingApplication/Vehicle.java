package Encapsulation_Polymorphism_Interface_Abstract.RideHailingApplication;

abstract class Vehicle {
    private String vehicleId;
    private String vehicleName;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String vehicleName, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getters (Encapsulation)
    public String getVehicleId() {
        return vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // Setters (if needed for updates)
    protected void setRatePerKm(double rate) {
        this.ratePerKm = rate;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Vehicle : " + vehicleName);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: Rs. " + ratePerKm);
    }
}
