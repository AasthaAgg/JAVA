import java.util.Scanner;
class FirstNPrime{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=2;
		for(int a=0;a<n;){
			int flag=0;
			for(int i=2;i*i<=num;i++){
				if(num%i==0){
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.print(num);
				a++;
			}
			num++;
		}
	}
}


