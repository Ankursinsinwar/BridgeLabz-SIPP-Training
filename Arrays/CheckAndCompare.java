package Arrays;

import java.util.Scanner;
public class CheckAndCompare{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		
		for (int i = 0; i < numbers.length; i++){
			System.out.print("Enter number " + i + ": ");
			numbers[i] = sc.nextInt();
		}
		String[] evOdd = {"Even","Odd"};
		for (int j = 0; j < numbers.length; j++){
			if(numbers[j] > 0){
				System.out.println("Number " + numbers[j] + " is: " + evOdd[(numbers[j]%2)]);
			}
			else if(numbers[j] == 0){
				System.out.println("Number " + numbers[j] + " is: " + 0);

			}else{
				System.out.println("Number " + numbers[j] + " is: " + "Negative");

			}
		}
		sc.close();
		
	}
}