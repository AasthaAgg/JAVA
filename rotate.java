import java.util.Scanner;

class rotate{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int k=sc.nextInt();
		int size=0;
		int n=num;
		
		while(n!=0){
			n = n/10;
			size++;
		}
		int rotNo=0;
		for(int i=0;i<k;i++){
			int mod=num%10;
			num = num + mod*(int)Math.pow(10,size);
			num=num/10;
		}
		System.out.println(num);
	}
}