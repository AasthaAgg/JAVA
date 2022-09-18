import java.util.Scanner;
class primeBetween{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		
		for(int i=low; i<=high; i++){
			int count=0;
			for(int j=2; j*j<i; j++){
				if(i%j==0){
					count=1;
					break;
				}
			}
			if(count==0)
				System.out.println(i);
		}
	}
}