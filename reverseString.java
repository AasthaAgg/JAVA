/* Program to reverse a string */

class reverseString{
	
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
		System.out.println(reverse(null));			//null
		System.out.println(reverse(""));			//
		System.out.println(reverse("Hello"));		//olleH
		System.out.println(reverse("Hi!!"));		//!!iH
	}
}