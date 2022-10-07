import java.util.Scanner;
class nthTermAP{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 		//first term
		int b = sc.nextInt(); 		//second term
		int n = sc.nextInt(); 		//term to find
		
		System.out.print(a + (n-1)*(b-a));
	}
}