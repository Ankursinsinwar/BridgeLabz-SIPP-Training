package Level1;

// class definition
public class CarRental {

    // Atributes
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 500.0;

    // Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // methode to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // main methode
    public static void main(String[] args) {
        CarRental rental = new CarRental("Ankur", "Honda City", 4);
        System.out.println("Total Cost: Rs. " + rental.calculateTotalCost());
    }
}
