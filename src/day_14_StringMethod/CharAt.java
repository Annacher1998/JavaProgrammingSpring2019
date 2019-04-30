package day_14_StringMethod;

public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word="Computer";
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		//System.out.println(word.charAt(8));
		
		String word2 ="Java";
		if (word2.charAt(0)=='J') {
		System.out.println("Yes, 1st position is J character");
		}else {
			System.out.println("No");
		}
	
	String word3= "mamim";
	if(word3.charAt(0) == word3.charAt(4) ) {
		System.out.println("Yes. 1st and last character are same");
	}else {
		System.out.println("No, there are different");
	}
	// char first = word3.charAt(0);
	// char last =word3.charAt(4);
	// if ( first ==last){
	// sysout("match");
	//}else{
	// sysout("not match";
	 String word4="chernyshova";
 char lastChar=word4.charAt(word4.length())	; 
	System.out.println("Last value is: "+ lastChar);
	
	}

}
