import java.util.Scanner;

class pythagoreanTriplet{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		boolean flag=false;
		
		if(a>b && a>c){
			if((a*a == b*b + c*c)){
				flag=true;
			}
		}
		else if(b>a && b>c){
			if((b*b == a*a + c*c)){
				flag=true;
			}
		}
		else{
			if((c*c == b*b + a*a)){
				flag=true;
			}
		}
		System.out.print(flag);
	}
}