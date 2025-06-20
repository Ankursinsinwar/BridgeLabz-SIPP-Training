package Methods;

import java.util.Scanner;
public class UnitConverter3 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.print("Enter celsius: ");
        double celsius = sc.nextDouble();
        System.out.print("Enter pounds: ");
        double pounds = sc.nextDouble();
        System.out.print("Enter kilograms: ");
        double kilograms = sc.nextDouble();
        System.out.print("Enter gallons: ");
        double gallons = sc.nextDouble();
        System.out.print("Enter liters: ");
        double liters = sc.nextDouble();

        System.out.println("Fahrenheit to Celsius: " + convertFahrenheitToCelsius(fahrenheit));
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(pounds));
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(kilograms));
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(gallons));
        System.out.println("Liters to Gallons: " + convertLitersToGallons(liters));

        sc.close();
    }
}