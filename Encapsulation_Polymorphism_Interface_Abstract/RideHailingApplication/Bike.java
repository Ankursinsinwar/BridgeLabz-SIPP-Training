package Encapsulation_Polymorphism_Interface_Abstract.RideHailingApplication;

class Bike extends Vehicle implements GPS {
    private String currentLocation;
    private final static String vehiclName = "Bike";

    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, vehiclName, driverName, ratePerKm);
        this.currentLocation = location;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20; // ₹20 base fare for Bike
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
