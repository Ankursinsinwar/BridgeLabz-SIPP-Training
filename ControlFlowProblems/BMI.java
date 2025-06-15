package ControlFlowProblems;

import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight (in kg): ");
        Double weight = sc.nextDouble();
        System.out.print("Enter height(in cm): ");
        Double height = sc.nextDouble();

        Double BMI = weight / ((height / 100) * (height / 100));
        if (BMI <= 18.4) {
            System.out.println("Underweight");
        }
        else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Normal");
        
        }else if (BMI >= 25.0 && BMI <= 39.9) {
            System.out.println("Oeverweight");

        } else {
            System.out.println("Obese");
        }
        sc.close();
    }
}
