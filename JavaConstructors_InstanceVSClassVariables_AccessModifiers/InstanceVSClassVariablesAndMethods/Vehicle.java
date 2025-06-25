package InstanceVSClassVariablesAndMethods;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1500.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("\nOwner: " + ownerName + "\nVehicle: " + vehicleType + "\nFee: Rs. " + registrationFee);
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ankur", "Bike");
        Vehicle v2 = new Vehicle("David", "Car");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(2000.0);

        System.out.println("--- After Fee Update ---");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
