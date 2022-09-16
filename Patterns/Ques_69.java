/*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
*/

class Ques_69{
	public static void main(String arg[]){
		for(int i=5;i>0;i--){
			int x=1;
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++){
				System.out.print((x++) +" ");
			}
			System.out.println();
		}
	}
}