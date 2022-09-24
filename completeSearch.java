// Given a value N, generate all strings which contain N pairs of brackets (opening and closing are balanced)

class completeSearch{
	public static void generateBrackets(String s,int open, int close, int n){
		if(s.length()==2*n){
			System.out.println(s);
			return;
		}
		
		if(open<n){
			generateBrackets(s + '(' , open+1, close , n);
		}
		if(close<n){
			generateBrackets(s + ')' , open, close+1 , n);
		}
	}
	
	public static void main(String arg[]){
		generateBrackets("" , 0 , 0 , 3);		
	}
}