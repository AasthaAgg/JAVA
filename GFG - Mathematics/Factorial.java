import java.util.Scanner;
class Factorial{
	public static int findFactorial(int num){
		int fact=1;
		while(num > 1){
			fact=fact*num;
			num--;
		}
		return fact;
	}

	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(findFactorial(n));
	}
}