package Inheritance.Single_Inheritance;

// SuperClass
class Device {
    int deviceId;
    String status;

    Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus(){
        System.out.println("Device ID: " + deviceId + "\n status: " + status);
    }
}

// SubClass Thermostart
class Thermostat extends Device {
    Double temperatureSetting;

    Thermostat(int deviceId, String status, Double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus(){
        super.displayStatus();
        System.out.println("temperature : " + temperatureSetting);
        System.out.println("----------------");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Device T1 = new Thermostat(101,"Manual", 20.0);
        Device T2 = new Thermostat(102, "Energy savings", 24.0);
        Device T3 = new Thermostat(103, "Off", null);
    
        T1.displayStatus();
        T2.displayStatus();
        T3.displayStatus();
    }
}
