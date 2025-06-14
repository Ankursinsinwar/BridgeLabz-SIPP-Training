// Question 1
package JavaFundamentals;

import java.lang.Math;
class Volume_of_Earth{
	public static void main(String[] args){
		int radius_km = 6378;
		double radius_miles =  radius_km * 0.621371;

		double vol_km = Math.PI * Math.pow(radius_km,3);
		double vol_miles = Math.PI * Math.pow(radius_miles,3);

		System.out.println(" The volume of earth in cubic kilometers is "+ vol_km +" and cubic miles is "+ vol_miles);
	}
}