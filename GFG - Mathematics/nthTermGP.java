import java.util.Scanner;
class nthTermGP{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 		//first term
		int b = sc.nextInt(); 		//second term
		int n = sc.nextInt(); 		//term to find
		
		System.out.print((int)Math.floor(a * Math.pow((double)b/a, n-1)));
	}
}