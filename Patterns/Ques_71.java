/*
55555
 4444
  333
   22
    1  */

class Ques_71{
	public static void main(String arg[]){
		for(int i=5;i>0;i--){
			for(int j=5;j>i;j--){
				System.out.print(" ");
			}
			for(int j=0;j<i;j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}