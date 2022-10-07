import java.util.Scanner;
class TrailingZeroesInFactorial{
	public static int countZeroes(int num){
		
	//	int fact=1;
	//	while(num > 1){
	//		fact=fact*num;
	//		num--;
	//	}
		
	//	int z=0;
	//	while(fact%10 == 0){
	//		z++;
	//	}
	//	return z;
		
		int noOf5=0;
		int fact5 = 5;
		while(num > fact5){
			noOf5 = noOf5 + (num/fact5);
			fact5 = fact5 * 5;
		}
		return noOf5;
	}

	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(countZeroes(n));
	}
}