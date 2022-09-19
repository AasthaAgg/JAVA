// Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.Scanner;
class arraySortCheck{
	public static boolean arraySorted(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			if(arr[i] > arr[i+1]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.print(arraySorted(arr));
	}
}