/*
AAAAA
BBBB
CCC
DD
E
*/

class Ques_61{
	public static void main(String arg[]){
		for(char i='A';i<='E';i++){
			for(char j='E';j>=i;j--){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}