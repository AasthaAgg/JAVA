/*Inverse of a number

	Index			5 4 3 2 1
For some number 	3 4 2 5 1

Output should be:
	Index			5 4 3 2 1
For some number 	2 4 2 3 1

swapped positions of index and the number placed at that location
*/

import java.util.Scanner;
class inverse{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		int rev=0;
		
		while(num!=0){
			count++;
			int pos = num%10;
			num = num/10;
			rev = rev+((int)Math.pow(10,pos-1))*count;
		}
		System.out.print(rev);
	}
}