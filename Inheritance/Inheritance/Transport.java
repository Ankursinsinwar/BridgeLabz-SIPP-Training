package Inheritance.Inheritance ;

// Superclass
class Vehicle {
    int maxSpeed;
    String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Speed: " + maxSpeed + " km/h, Fuel: " + fuelType);
    }
}

// Car subclass
class Car extends Vehicle {
    int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Seat Capacity: " + seatCapacity);
        super.displayInfo();
    }
}

// Truck subclass
class Truck extends Vehicle {
    double loadCapacity;

    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Load Capacity: " + loadCapacity + " tons");
        super.displayInfo();
    }
}

// Motorcycle subclass
class Motorcycle extends Vehicle {
    boolean hasGear;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle has gear: " + hasGear);
        super.displayInfo();
    }
}

public class Transport {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10);
        vehicles[2] = new Motorcycle(90, "Petrol", true);

        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("-----------");
        }
    }
}
