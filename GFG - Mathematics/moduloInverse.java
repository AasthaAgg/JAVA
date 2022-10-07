// Find the smallest modular multiplicative inverse of ‘a’ under modulo ‘m’.

import java.util.Scanner;
class moduloInverse{
	public static int modInverse(int a, int m)
    {
      //Your code here
      for(int i=0;i<m;i++){
          if(((a*i)%m)==1){
              return i;
          }
      }
      return -1;
    }
	
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.print(modInverse(a,m));
	}
}