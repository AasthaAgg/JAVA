//Find the sum of a and b under modulo (10^9)+7

import java.util.Scanner;
class addUnderModulo{

	public static long sumUnderModulo(long a, long b){
        long mod = 1000000007;
        
        return ((a%mod)+(b%mod))%mod;
    }

	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		System.out.print(sumUnderModulo(a,b));
	}
}