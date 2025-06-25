package This_Static_Final_InstanceofOperator;

// class Definition
public class Vehicle {
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    static double registrationFee = 2500.0;

    // Constructor
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Instance method using instanceof
    public void displayVehicleDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            System.out.println("\nReg No: " + v.registrationNumber);
            System.out.println("Owner: " + v.ownerName);
            System.out.println("Type: " + v.vehicleType);
            System.out.println("Registration Fee: Rs. " + registrationFee);
        } else {
            System.out.println("Invalid Vehicle object.");
        }
    }

    // main method
    public static void main(String[] args) {
        // create objects of Vehicle
        Vehicle v1 = new Vehicle("MH12AB1234", "Ankur", "Bike");
        Vehicle v2 = new Vehicle("DL8CAF4321", "David", "Car");

        v1.displayVehicleDetails(v1);

        // update RegistrationFee
        updateRegistrationFee(3000.0);
        System.out.println("\n=== Fee Updated ===");

        v2.displayVehicleDetails(v2);
    }
}
