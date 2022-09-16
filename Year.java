// WAP that takes no. of year as input and display no. of months, weeks, days, hours, minutes and seconds in that duration.

import java.util.*;
public class Year{
	public static void main(String args[]){
		int y,m,w,d,h,min,sec;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter no.of years:");
		y=S.nextInt();
		m=y*12;
		w=y*52;
		d=y*365;
		h=d*24;
		min=h*60;
		sec=min*60;
		System.out.println("Months="+m);
		System.out.println("Weeks="+w);
		System.out.println("Days="+d);
		System.out.println("Hours="+h);
		System.out.println("Minutes="+min);
		System.out.println("Seconds="+sec);
	}
}