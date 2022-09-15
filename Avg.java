// WAP to find the average of 3 no.

import java.util.*;
public class Avg{
	public static void main(String args[]){
		int a,b,c,d;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		a=S.nextInt();
		b=S.nextInt();
		c=S.nextInt();
		d=(a+b+c)/3;
		System.out.println("Average:"+d);
	}
}		