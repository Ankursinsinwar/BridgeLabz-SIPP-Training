// Question 22
package JavaFundamentals;

import java.util.Scanner;
public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("");
        int numberOfStudents= sc.nextInt();

		int numberOfHandshake=(numberOfStudents*(numberOfStudents-1))/2;

        System.out.println( "The maximum number of handshakes is "+ numberOfHandshake);
        sc.close();
    }
}
