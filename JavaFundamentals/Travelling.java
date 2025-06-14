// Question 21
package JavaFundamentals;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter From City: ");
        String fromCity = input.nextLine();

        System.out.print("Enter Via City: ");
        String viaCity = input.nextLine();

        System.out.print("Enter To City: ");
        String toCity = input.nextLine();

        System.out.print("Enter distance from FromCity to ViaCity (in miles): ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter distance from ViaCity to ToCity (in miles): ");
        double viaToFinalCity = input.nextDouble();

        System.out.print("Enter time from FromCity to ViaCity (in minutes): ");
        int timeFromToVia = input.nextInt();

        System.out.print("Enter time from ViaCity to ToCity (in minutes): ");
        int timeViaToFinalCity = input.nextInt();

        double totalDistanceKm = (fromToVia + viaToFinalCity) * 1.6;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +
                           " is " + totalDistanceKm + " km and the Total Time taken is " + totalTime + " minutes");

        input.close();
    }
}
