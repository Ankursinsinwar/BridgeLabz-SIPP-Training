package Encapsulation_Polymorphism_Interface_Abstract.RideHailingApplication;

class Auto extends Vehicle implements GPS {
    private String currentLocation;
    private final static String vehiclName = "Auto";

    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, vehiclName, driverName, ratePerKm);
        this.currentLocation = location;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 30; // ₹30 base fare for Auto
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
