import java.util.Scanner;
class reverse{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int mod,rev=0;
		while(num!=0){
			mod=num%10;
			num=num/10;
			rev = rev*10+mod;
		}
		System.out.println(rev);
	}
}