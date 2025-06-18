package Arrays;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a natural number: ");
		int number = sc.nextInt();

		if (number <= 0) {
			System.out.println("Error: Not a natural number.");
			sc.close();
			return;
        	}

		int[] even = new int[number / 2 + 1];
		int[] odd = new int[number / 2 + 1];
		int evenIdx = 0;
		int oddIdx = 0;

		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				even[evenIdx++] = i;
			} else {
				odd[oddIdx++] = i;
			}
		}

		for (int i = 0; i < oddIdx; i++){
			System.out.println("Odd numbers: " + odd[i] + " ");
		}

		for (int i = 0; i < evenIdx; i++){
			System.out.println("Even numbers: " + even[i] + " ");
		}
		sc.close();
	}
}
