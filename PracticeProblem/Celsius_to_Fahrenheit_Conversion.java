package PracticeProblem;

import java.util.Scanner;
class Celsius_to_Fahrenheit_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float Celsius = sc.nextFloat();
        float Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + Fahrenheit);
        sc.close();
    }
}
