package Methods;

import java.util.Random;

public class EmployeeBonusCalculator {
    
    public static double[][] generateSalariesAndYears(int count) {
        Random random = new Random();
        double[][] data = new double[count][2];

        for (int i = 0; i < count; i++) {
            data[i][0] = 10000 + random.nextInt(90000);
            data[i][1] = random.nextInt(11);
        }

        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] data) {
        double[][] result = new double[data.length][3];
        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }

        return result;
    }

    public static void displaySummary(double[][] data) {
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.printf("%-10s | %-10s | %-10s | %-10s%n", "Employee", "OldSalary", "Bonus", "NewSalary");
        System.out.println("--------------------------------------------------");


        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10d | %-10.2f | | %-10.2f | %-10.2f%n", i + 1, data[i][0], data[i][1], data[i][2]);
            totalOldSalary += data[i][0];
            totalBonus += data[i][1];
            totalNewSalary += data[i][2];
        }

        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s | %-10.2f | %-10.2f | %-10.2f%n", "Total", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        double[][] salariesAndYears = generateSalariesAndYears(10);
        double[][] newSalaryAndBonus = calculateNewSalaryAndBonus(salariesAndYears);
        displaySummary(newSalaryAndBonus);
    }
}