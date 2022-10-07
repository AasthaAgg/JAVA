import java.util.Scanner;

class tempCelsiusToFahrenhiet{
	
	public static double findFahrenhiet(int temp){
		return temp*1.8+32;
	}
	
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter temperature(in C) : ");
		int temp = sc.nextInt();
		
		System.out.printf("Temperature(in F) : %.1f",findFahrenhiet(temp));
	}
}