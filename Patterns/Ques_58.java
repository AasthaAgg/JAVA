/*
A
AB
ABC
ABCD
ABCDE
*/

class Ques_58{
	public static void main(String arg[]){
		for(char i='A';i<='E';i++){
			for(char j='A';j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}