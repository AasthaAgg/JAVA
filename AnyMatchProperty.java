/* Validate String */

/* Check if string contains atleast one uppercase, one lowercase and one number */

class AnyMatchProperty{
	
	public static boolean isPasswordComplex(String s){
	
		// Checks each character of the string and returns true even if 1 Matches
		return s.chars().anyMatch(Character::isUpperCase) &&
				s.chars().anyMatch(Character::isLowerCase) &&
				s.chars().anyMatch(Character::isDigit);
				
		
	}
	
	public static void main(String[] args){
		System.out.println(isPasswordComplex("hell0"));		// false
		System.out.println(isPasswordComplex("HELLO"));		// false
		System.out.println(isPasswordComplex("hello"));		// false
		System.out.println(isPasswordComplex("Hello123"));	// true
		
	}
}