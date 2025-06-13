package Problem_11_06_25;

import java.util.Scanner;
import java.lang.Math;
class Volume_of_a_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the cylinder: ");
        int radius = sc.nextInt();
        System.out.print("Enter height of the cylinder: ");
        int height = sc.nextInt();
        double Volume = Math.PI * Math.pow(radius,2) * height;
        System.out.println("Volum of cylinder : "+ Volume);
        sc.close();
    }
}
