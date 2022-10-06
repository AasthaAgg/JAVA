/* Normalise String */

class StringUpdation{
	
	public static String normaliseString (String s){
		/*
		String lowercased = s.toLowerCase();
		String trimmed = lowercased.trim();
		String replaced = trimmed.replace("," , "");
		return replaced;		*/
		
		return s.toLowerCase().trim().replace("," , "");
	}
	
	public static void main(String[] args){
		System.out.println(normaliseString("    Hello there, BUDDY"));	// hello there buddy
	}
}