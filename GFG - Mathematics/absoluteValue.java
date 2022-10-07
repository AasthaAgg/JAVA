import java.util.Scanner;

class absoluteValue{
	
	public static int findAbsolute(int n){
		return Math.abs(n);
	}
	
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		
		System.out.print("Absolute Value : "+findAbsolute(num));
	}
}