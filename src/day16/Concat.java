package day16;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "java";
		System.out.println(word.concat(" + selenuim"));
		System.out.println(word.concat(" in selenium"));

		word = word.concat("+ Eclipse");
		System.out.println(word);
		word = word.concat(" Automation");
		System.out.println(word);
	
	word=word +  " - Cucumber";
	System.out.println(word);
	
	word=word+123;
	System.out.println(word);
	String word1="Hi";
	word1=word1.concat("- hey").concat("- how are you").concat(" - good");
	
	System.out.println(word1);
	
	}

}
