import java.util.Scanner;
class Palindrome{
	public static boolean checkPalindrome(int num){
		int rev=0;
		int n = num;
		while(n>0){
			rev = rev*10 + n%10;
			n = n/10;
		}
		return (num == rev);
	}

	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(checkPalindrome(n)){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}
	}
}