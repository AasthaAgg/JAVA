/* Validate String */

class AllOrNothingProperty{
	
	public static boolean isUpperCase(String s){
		return s.chars().allMatch(Character::isUpperCase);	// Checks each character of the string and returns true only if all Matches
	}
	
	public static boolean isLowerCase(String s){
		//s.chars().noneMatch(Character::isUpperCase);
		return s.chars().allMatch(Character::isLowerCase);
	}
	
	public static void main(String[] args){
		System.out.println(isUpperCase("hello"));	// false
		System.out.println(isUpperCase("HELLO"));	// true
		System.out.println(isLowerCase("hello"));	// true
		System.out.println(isLowerCase("HELLO"));	// false
		
	}
}