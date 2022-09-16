/*
54321
5432
543
54
5
*/

class Ques_65{
	public static void main(String arg[]){
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}