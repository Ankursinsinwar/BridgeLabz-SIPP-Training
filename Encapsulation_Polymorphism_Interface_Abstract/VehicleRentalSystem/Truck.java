package Encapsulation_Polymorphism_Interface_Abstract.VehicleRentalSystem;

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 1000; // heavy-duty fee
    }

    @Override
    public double calculateInsurance() {
        return 2500.0;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: [REDACTED]";
    }

    // Setter to update policy number securely
    public void setInsurancePolicyNumber(String policyNumber) {
        this.insurancePolicyNumber = policyNumber;
    }
}
