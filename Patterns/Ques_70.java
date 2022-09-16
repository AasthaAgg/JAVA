/*
	A
   B B
  C C C
 D D D D
E E E E E */

class Ques_70{
	public static void main(String arg[]){
		char c='A';
		for(int i=5;i>0;i--){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(char j=5;j>=i;j--){
				System.out.print(c+" ");
			}
			c++;
			System.out.println();
		}
	}
}		