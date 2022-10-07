import java.util.Scanner;
class checkPrime{

	public static boolean isPrime(int N) {
      
		for(int i=2; i*i<=N; i++){
			if(N % i == 0){
				return false;
			}
		}
		return true;
    }

	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 		
		
		System.out.print(isPrime(n));
	}
}