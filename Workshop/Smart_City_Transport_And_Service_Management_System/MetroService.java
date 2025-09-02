package Workshop.Smart_City_Transport_And_Service_Management_System;

public class MetroService implements TransportService {
    private String name;
    private double fare;
    private boolean active;

    public MetroService(String name, double fare, boolean active) {
        this.name = name;
        this.fare = fare;
        this.active = active;
    }

    public String getName() { return name; }
    public double getFare() { return fare; }
    public boolean isActive() { return active; }
}
