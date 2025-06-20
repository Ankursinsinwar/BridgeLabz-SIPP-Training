package Methods;

import java.util.Scanner;

public class EuclideanDistanceLineEquation {

    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m;
        if (x2 - x1 == 0) {
            throw new IllegalArgumentException("Slope is undefined for vertical line.");
        } else {
            m = (y2 - y1) / (x2 - x1);
        }
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between points: " + distance);

        try {
            double[] equation = lineEquation(x1, y1, x2, y2);
            System.out.println("Equation of line: y = " + equation[0] + "x + " + equation[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}