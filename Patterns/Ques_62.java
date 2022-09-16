/*
ABCDE
ABCD
ABC
AB
A
*/

class Ques_62{
	public static void main(String arg[]){
		for(char i='E';i>='A';i--){
			for(char j='A';j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}