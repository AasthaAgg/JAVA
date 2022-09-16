// WAP to swap 2 no without using 3rd variable

import java.util.*;
public class swap{
	public static void main(String args[]){
		int a,b;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter two numbers for swapping:");
		a=S.nextInt();
		b=S.nextInt();
		System.out.println("Before swapping:\na="+a+"\nb="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping:\na="+a+"\nb="+b);
	}
}