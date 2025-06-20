package Methods;

import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25.0) return "Normal";
        if (bmi < 30.0) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight for persion " + (i + 1) + ": ");
            double weight = sc.nextDouble();
            System.out.print("Enter height for persion " + (i + 1) + ": ");
            double height = sc.nextDouble();

            if (weight < 0 || height < 0) {
                System.out.println("Enter positive value only");
                sc.close();
                return;
            }

            double bmi = calculateBMI(weight, height);
            data[i][0] = weight;
            data[i][1] = height;
            data[i][2] = bmi;
            status[i] = determineBMIStatus(bmi);
        }

        System.out.printf("%-10s | %-10s | %-10s | %-10s | %-10s\n", "Persion","weight", "Height", "BMI", "Status");
        System.out.println("--------------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s | %-10s | %-10s | %-10.2f | %-10s\n", (i + 1), data[i][0], data[i][1], data[i][2], status[i]);
        }
        sc.close();
    }
}