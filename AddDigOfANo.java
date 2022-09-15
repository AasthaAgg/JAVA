// WAP to find the sum of all the digits of a 5 digit no.

import java.util.*;
public class AddDigOfANo{
	public static void main(String args[]){
		int a,b,c,d,n,s;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter a 5 digit number");
		n=S.nextInt();
			a=n%10;
			n=n/10;
			b=n%10;
			n=n/10;
			c=n%10;
			n=n/10;
			d=n%10;
			n=n/10;
		s=a+b+c+d+n;
		System.out.println("Sum of digits="+s);
	}
}