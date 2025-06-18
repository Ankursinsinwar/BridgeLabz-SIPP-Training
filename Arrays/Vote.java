package Arrays;

import java.util.Scanner;
public class Vote{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] age = new int[10];
		for (int i = 0; i < age.length; i++){
			System.out.print("Enter Age of student no. " + (i+1) + ": ");
			age[i] = sc.nextInt();
		}

		for (int j = 0; j < age.length; j++){
			if (age[j] < 0){
				System.out.println(age[j] + " is an invalid age");
			}else if (age[j] >= 18){
				System.out.println("student with the age " + age[j] + " can vote");
			}else{
				System.out.println("student with the age " + age[j] + " cannot vote");

			}
		}
		sc.close();
		
	}
}