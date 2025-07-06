package Encapsulation_Polymorphism_Interface_Abstract.VehicleRentalSystem;

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // includes service fee
    }

    @Override
    public double calculateInsurance() {
        return 1000.0;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: [REDACTED]";
    }

    // Setter to update policy number securely
    public void setInsurancePolicyNumber(String policyNumber) {
        this.insurancePolicyNumber = policyNumber;
    }
}
