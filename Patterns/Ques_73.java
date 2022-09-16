/*
EEEEE
DDDD
CCC
BB
A  */

class Ques_73{
	public static void main(String arg[]){
		char c='E';
		for(int i=0;i<5;i++){
			for(int j=5;j>i;j--){
				System.out.print(c);
			}
			System.out.println();
			c--;
		}
	}
}