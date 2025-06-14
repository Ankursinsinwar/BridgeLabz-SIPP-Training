package PracticeProblem;
import java.util.Scanner;
import java.lang.Math;
class Area_of_a_Circle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("radius : ");
		int radius = sc.nextInt();
		double Area = Math.PI * Math.pow(radius,2);
		System.out.print("Area : "+Area);
		sc.close();
	}
}