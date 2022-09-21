import java.io.IOException;
import java.util.Scanner;

public class DigiClock extends Thread{
	public static void main(String args[])throws InterruptedException,IOException{
		
		Scanner t=new Scanner(System.in);
		
		System.out.println("Enter Current time in 24 hours clock format:");
			System.out.print("Enter Hours:");
				int h = t.nextInt();
			System.out.print("Enter Minutes:");
				int m = t.nextInt();
			System.out.print("Enter Seconds:");
				int s = t.nextInt();
			
			for(int i=h;i<24;i++){
				int h1;
					if(i>11){
						h1=i%12;
					}
					else{
						h1=i;
					}
				for(int j=m;j<60;j++){
					for(int k=s;k<60;k++){
							
						if(i<=9)
							System.out.print("\t\t\t\t0"+h1+":");
						else
							System.out.print("\t\t\t\t"+h1+":");
						if(j<=9)
							System.out.print("0"+j+":");
						else
							System.out.print(j+":");
						if(k<=9)
							System.out.print("0"+k);
						else
							System.out.print(k);
						if(i<12)
							System.out.print("  A.M.");
						else
							System.out.print("  P.M.");
							
						Thread.sleep(985);
						new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
						s=0;
					}
					m=0;
				}
				h=0;
			}
	}
}