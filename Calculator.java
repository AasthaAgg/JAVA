// WAP to perform basic mathematical calculations

import java.util.Scanner;

public class Calculator{
	public static void main(String arg[]){
		char c ='y';
		Scanner s = new Scanner(System.in);

		while(c =='y' || c =='Y'){
			System.out.println("(1) Addition");
			System.out.println("(2) Subtraction");
			System.out.println("(3) Multiplication");
			System.out.println("(4) Division");
			System.out.print("Select the operation you want to perform: ");
				int n = s.nextInt();

				System.out.println();
				System.out.print("Enter 1st number:");
					int a = s.nextInt();
				System.out.print("Enter 2nd number:");
					int b = s.nextInt();
				System.out.println();
				
				
			switch(n){
				case 1:System.out.println("\tSum = "+(a+b));
						break;
				case 2:System.out.println("\tDifference = "+(a-b));
						break;
				case 3:System.out.println("\tProduct = "+(a*b));
						break;
				case 4:System.out.println("\tQuotient = "+(a/b));
						System.out.println("\tRemainder = "+(a%b));
						break;
				default:System.out.println("Invalid Input");
						break;
			}
			
			System.out.println();
			System.out.println("Want to perform more Calculations :");
			System.out.print("Y or N:  ");
				c = s.next().charAt(0);
		}
	}
}