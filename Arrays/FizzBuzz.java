package Arrays;

import java.util.Scanner;
public class FizzBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int number = sc.nextInt();
		if (number <= 0) {
			System.out.println("Please enter a positive integer.");
			sc.close();
			return;
		}

		String[] FizzBuzz= new String[number];

		for (int i = 0; i < number; i++) {
			if (i % 3 == 0 && i % 5 == 0 && i != 0) {
				FizzBuzz[i] = "FizzBuzz";
			} else if (i % 3 == 0 && i != 0) {
				FizzBuzz[i] = "Fizz";
			} else if (i % 5 == 0 && i != 0) {
				FizzBuzz[i] = "Buzz";
			} else {
				FizzBuzz[i] = String.valueOf(i);
			}
		}

		for (int i = 0; i <= number; i++) {
			System.out.println("Position " + i + " = " + FizzBuzz[i]);
		}

		sc.close();
	}
}