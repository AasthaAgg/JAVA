/*
12345
 1234
  123
   12
    1  */

class Ques_72{
	public static void main(String arg[]){
		for(int i=5;i>0;i--){
			for(int j=i;j<5;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}