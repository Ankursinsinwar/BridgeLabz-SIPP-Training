package Strings;

import java.util.Random;
import java.util.Scanner;
public class VotingEligibility {

    public static int[] generateRandomAges(int numberOfStudents) {
        Random rand = new Random();
        int[] ages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = rand.nextInt(90) + 10;
        }

        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "Invalid";
            } else if (age >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    public static void displayResult(String[][] data) {
        System.out.printf("%-5s | %-10s\n", "Age", "Can Vote?");
        System.out.println("--------------------------");

        for (String[] row : data) {
            System.out.printf("%-5s | %-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateRandomAges(n);
        String[][] result = checkVotingEligibility(ages);

        displayResult(result);
        sc.close();
    }
}

