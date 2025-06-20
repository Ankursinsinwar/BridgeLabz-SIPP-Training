package Methods;

import java.util.Scanner;
public class UnitConvertor1 {
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        double feet = yards * yards2feet;
        return feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        double yard = feet * feet2yards;
        return yard;
    }

    public static double convertMetersToInches(double meters) {
    double meters2inches = 39.3701;
    double inch = meters * meters2inches;
        return inch;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        double meter = inches * inches2meters;
        return meter;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        double Centimeter = inches * inches2cm;
        return Centimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter yards: ");
        double yards = sc.nextDouble();

        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();

        System.out.print("Enter meter :");
        double meters = sc.nextDouble();

        System.out.print("Enter inches: ");    
        double inches = sc.nextDouble();

        System.out.println("Yards to Feet: " + convertYardsToFeet(yards));
        System.out.println("Feet to Yards: " + convertFeetToYards(feet));
        System.out.println("Meters to Inches: " + convertMetersToInches(meters));
        System.out.println("Inches to Meters: " + convertInchesToMeters(inches));
        System.out.println("Inches to Centimeters: " + convertInchesToCentimeters(inches));
        sc.close();
    }
}