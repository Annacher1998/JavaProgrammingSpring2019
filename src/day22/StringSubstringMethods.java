package day22;

public class StringSubstringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word="java";

		
		//print each character in separate line using substring
		System.out.println(word.substring(0,1));
		System.out.println(word.substring(1,2));
		System.out.println(word.substring(2,3));
		System.out.println(word.substring(3,4));
		
		 System.out.println();
		int i=0;
		 System.out.println(word.substring(i,i+1));
		 System.out.println(word.substring(i+1,i+2));
		 System.out.println(word.substring(i+2,i+3));
		 System.out.println(word.substring(i+3,i+4));
	
	System.out.println();
		 for(int j=0;j<=3;j++) {
		
		//System.out.println(word.substring(j,j+1));
			 String letter=word.substring(j,j+1);
			 System.out.println(letter);
	}
	System.out.println("##############REVERSE##############");
	
	for(int n=3;n>=0;n--) {
		String letter1=word.substring(n,n+1);
		System.out.println(letter1);
	}
	
	int start=1;
	int end=5;
	String word2="UnitedStates";
	System.out.println(word2.substring(start,end));
	// print last character
	String word3="apple";
	System.out.println(word3.substring(word3.length()-1));
	
	
	
	
	
	}

}
