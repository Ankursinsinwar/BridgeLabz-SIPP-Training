package Methods;

import java.util.Scanner;
public class WindChillCalculator {
    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();
        System.out.print("Enter wind speed: ");
        double windSpeed = sc.nextDouble();
        
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("Wind Chill Temperature: " + windChill);

        sc.close();
    }
}