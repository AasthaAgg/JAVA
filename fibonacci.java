import java.util.Scanner;
class fibonacci{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0,n2=1;
		for(int a=0;a<n;a++){
			System.out.print(n1+" ");
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}