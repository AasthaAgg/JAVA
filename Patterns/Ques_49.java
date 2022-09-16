/*
1
2 1
3 2 1 
4 3 2 1
5 4 3 2 1
*/

class Ques_49{
	public static void main(String arg[]){
		for(int i=1;i<6;i++){
			for(int j=i;j>0;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}