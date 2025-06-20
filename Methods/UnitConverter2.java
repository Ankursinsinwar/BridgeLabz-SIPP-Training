package Methods;

import java.util.Scanner;
public class UnitConverter2 {

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        double miles = km * km2miles;
        return miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        double km = miles * miles2km;
        return km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        double feet = meters * meters2feet;
        return feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        double meter = feet * feet2meters;
        return meter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distence in km:");
        double km = sc.nextDouble();
        System.out.print("Enter distence in miles:");
        double miles = sc.nextDouble();
        System.out.print("Enter distence in meters:");
        double meters = sc.nextDouble();
        System.out.print("Enter distence in feet:");
        double feet = sc.nextDouble();

        System.out.println("Km to Miles: " + convertKmToMiles(km));
        System.out.println("Miles to Km: " + convertMilesToKm(miles));
        System.out.println("Meters to Feet: " + convertMetersToFeet(meters));
        System.out.println("Feet to Meters: " + convertFeetToMeters(feet));

        sc.close();

    }

}