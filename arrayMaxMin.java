// Find the maximum & minimum number in an array of integers.

import java.util.Scanner;
class arrayMaxMin{
	public static void maxMin(int[] arr){
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] < min){
				min = arr[i];
			}
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		System.out.println("Maximum No. : "+max);
		System.out.println("Minimum No. : "+min);
	}
	
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		maxMin(arr);
	}
}