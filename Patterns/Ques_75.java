/*
ABCDE
 ABCD
  ABC
   AB
    A   */

class Ques_75{
	public static void main(String arg[]){
		for(int i=0;i<5;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			char c='A';
			for(int j=5;j>i;j--){
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}
}