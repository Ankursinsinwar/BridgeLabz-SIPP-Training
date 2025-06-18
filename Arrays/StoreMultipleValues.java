package Arrays;

import java.util.Scanner;
public class StoreMultipleValues{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Double[] numbers = new Double[10];
		Double total = 0.0;
		int index = 0;
		while(true){
			if(index == 10){
				break;
			}
			System.out.print("Enter a number(enter 0 or -ve number to stop ): ");
			Double number = sc.nextDouble();
			if(number <= 0){
				break;
			}
			numbers[index] = number;
			index++;
		}

		for (int j = 0; j < index; j++){
			total = total + numbers[j];
		}
		System.out.print("Total sum: " + total);

		sc.close();
		
	}
}