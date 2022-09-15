// WAP to find the area of a circle

import java.util.Scanner;

public class arCircle{
	public static void main(String arg[]){
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter radius of a circle: ");
			double r = s.nextDouble();
			
		System.out.print("Area of Circle = " + (3.14*r*r));
	}
}