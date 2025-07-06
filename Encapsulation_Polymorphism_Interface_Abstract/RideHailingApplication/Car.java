package Encapsulation_Polymorphism_Interface_Abstract.RideHailingApplication;

class Car extends Vehicle implements GPS {
    private String currentLocation;
    private final static String vehiclName = "Car";

    public Car(String vehicleId, String driverName, double ratePerKm, String location) {

        super(vehicleId, vehiclName, driverName, ratePerKm);
        this.currentLocation = location;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50; // ₹50 base fare for Car
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
