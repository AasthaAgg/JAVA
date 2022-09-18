/*
bbb*bbb
bb*i*bb
b*iii*b
*******
*/

import java.util.Scanner;
class pat{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=n-1;i>0;i--){
			for(int j=0;j<i;j++){
				System.out.print("b");
			}
			System.out.print("*");
			if(i != n-1){
				for(int k=0;k<(2*(n-i-1))-1;k++){
					System.out.print("i");
				}
				System.out.print("*");
			}
			for(int j=0;j<i;j++){
				System.out.print("b");
			}
			System.out.println();
		}
		for(int a=1;a<2*n;a++){
			System.out.print("*");
		}
	}
}