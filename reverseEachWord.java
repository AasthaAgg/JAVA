/* Program to reverse a string */

class reverseEachWord{
	public static String reverseWords(String s){
		if(s == null || s.isEmpty()){
			return s;
		}
		
		StringBuilder reversed = new StringBuilder();
		
		String word[] = s.split(" ");
		
		for(int i = 0; i<word.length; i++){
			
			// Doing directly inside the same function
			
	/*		for(int j = word[a].length() - 1; j>=0; j--){
				reversed.append(word[i].charAt(j));
			}
	*/
			// Using separate function
			reversed.append(reverse(word[i]));
			
			if(i != word.length - 1)
				reversed.append(" ");
		}
		return reversed.toString();
	}

	public static String reverse(String s){
		if(s == null || s.isEmpty()){
			return s;
		}
		
	// Using Custom Method
		
	/*	StringBuilder reversed = new StringBuilder();
		for(int i = s.length() - 1; i>=0; i--){
			reversed.append(s.charAt(i));
		}									
		return reversed.toString();			*/
		
	// Using built-in reverse method of StringBuilder class
		
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
	
	public static void main(String arg[]){
		System.out.println(reverseWords(null));							//null
		System.out.println(reverseWords(""));							//
		System.out.println(reverseWords("Hello, My name is John"));		//,olleH yM eman si nhoJ
		System.out.println(reverseWords("What can I do today?"));		//tahW nac I od ?yadot
		System.out.println(reverseWords("race racecar madam"));			//ecar racecar madam
	}
}