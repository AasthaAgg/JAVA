// WAP to find the area of a triangle

import java.util.Scanner;

public class arTri{
	public static void main (String arg[]){
		Scanner sc = new Scanner(System.in);
		
		char ch = 'y';
		while(ch== 'y'|| ch=='Y'){
			
			System.out.println();
			System.out.println("Find area of triangle using:");
			System.out.println("  (1) Base & Height of triangle");
			System.out.println("  (2) Sides of Triangle");
			System.out.print("Enter your choice: ");
				int d = sc.nextInt();
			System.out.println();
		
			switch(d){
				case 1:System.out.print("Enter height of triangle: ");
							double ht = sc.nextDouble();
						System.out.print("Enter base of triangle: ");
							double base = sc.nextDouble();
						System.out.println();
						System.out.println("Area of triangle = " + (0.5*base*ht));
					break;
						
				case 2:System.out.println("Choose the Type of triangle: ");
						System.out.println("  (3) Equilateral Triangle");
						System.out.println("  (4) Isosceles Triangle");
						System.out.println("  (5) Scalene Triangle");
						System.out.print("Enter your choice: ");
							int l= sc.nextInt();
						System.out.println();
						
						switch(l){
							case 3:System.out.print("Enter side of the triangle: ");
										double side = sc.nextDouble();
										System.out.println();
									System.out.println("Area of Equilateral triangle = " + Math.sqrt(3)*side*side/4);
								break;
								
							case 4:System.out.print("Enter two equal sides of triangle: ");
										double m = sc.nextDouble();
									System.out.print("Enter third different side of triangle: ");
										double n = sc.nextDouble();
									System.out.println();
									System.out.println("Area of Isosceles triangle = " + (n/2)*Math.sqrt(m*m - n*n/4));
								break;
								
							case 5:System.out.print("Enter 1st side: ");
										double x = sc.nextDouble();
									System.out.print("Enter 2nd side: ");
										double y = sc.nextDouble();
									System.out.print("Enter 3rd side: ");
										double z = sc.nextDouble();
									System.out.println();
									double s= (x+y+z)/2;
									System.out.println("Area of Scalene triangle: " + Math.sqrt(s*(s-x)*(s-y)*(s-z)));
								break;
								
							default:System.out.println("Invalid choice");
								break;
						}
					break;
				default:System.out.println("Invalid choice");
						break;
						
			}
			System.out.println(" ");
			System.out.print("Want to calculate more:");
			System.out.print("Y or N: ");
			ch = sc.next().charAt(0);
		}
	}
}