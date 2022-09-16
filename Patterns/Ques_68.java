/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
*/

class Ques_68{
	public static void main(String arg[]){
		for(int i=5;i>0;i--){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++){
				System.out.print((6-i) +" ");
			}
			System.out.println();
		}
	}
}