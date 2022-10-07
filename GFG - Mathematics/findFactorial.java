import java.util.Scanner;
class Factorial{
	public static boolean findFactorial(int num){
		int fact=1;
		while(num-- > 0){
			fact=fact*num;
		}
		return fact;
	}

	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(findFactorial(n));
	}
}