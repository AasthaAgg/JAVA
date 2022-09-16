/*
    *
   **
  ***
 ****
*****
*/

class Ques_39{
	public static void main(String arg[]){
		for(int i=5;i>0;i--){
			for(int j=i-1;j>0;j--){
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}