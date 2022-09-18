import java.util.Scanner;
class sumOfArray{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		
		int arr1 = new int[sc.nextInt()];
		for(int i=0; i<arr1.length; i++){
			arr1[i]=sc.nextInt();
		}
		
		int arr2 = new int[sc.nextInt()];
		for(int i=0; i<arr2.length; i++){
			arr2[i]=sc.nextInt();
		}
		
		int arr = new int[arr1.length > arr2.length ? arr1 : arr2];
		
		int a = arr1.length-1;
		int b = arr2.length-1;
		int c = arr.length-1;
		
		if(a>b){
			for(int ){}
		}
		
	}
}