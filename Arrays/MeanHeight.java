package Arrays;

import java.util.Scanner;
public class MeanHeight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Double[] heights = new Double[11];
		Double sum=0.0;

		for (int i = 0; i < heights.length; i++){
			System.out.print("Enter height of player " + (i + 1) + ": ");
			heights[i] = sc.nextDouble();
		}
		for (int i = 0; i < heights.length; i++){
			sum += heights[i];
		}
		Double mean = sum / 11;
		System.out.println("mean height of players in a football team: " + mean);
		sc.close();
	}
}