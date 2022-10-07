import java.util.Scanner;
class GCD{
	public static int findGCD(int a, int b){
		int res;
		if(a%b == 0){
			return b;
		}else{
			for(int i=(b/2)+1; i>1; i--){
				if((a%i == 0)&&(b%i == 0)){
					return i;
				}
			}
		}
		return 1;
	}

	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(findGCD(Math.max(a,b),Math.min(a,b)));
	}
}