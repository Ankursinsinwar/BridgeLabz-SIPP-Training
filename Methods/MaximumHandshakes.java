package Methods;

import java.util.Scanner;
public class MaximumHandshakes {
    
    public static int calculateHandshakes(int numberOfStudents) {
        return numberOfStudents * (numberOfStudents - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int students = sc.nextInt();

        int handshakes = calculateHandshakes(students);
        
        System.out.println("Maximum posible handshakes among " + students + " students: " + handshakes);

        sc.close();
    }
}