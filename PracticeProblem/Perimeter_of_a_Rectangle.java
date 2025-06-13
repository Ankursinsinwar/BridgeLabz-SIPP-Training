package Problem_11_06_25;

import java.util.Scanner;
class Perimeter_of_a_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length = sc.nextInt();
        System.out.print("Enter Width: ");
        int width = sc.nextInt();
        int perimeter = 2 * (length + width);
        System.out.println("Perimeter = " + perimeter);
        sc.close();
}
}
