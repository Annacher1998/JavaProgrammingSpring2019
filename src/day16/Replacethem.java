package day16;

public class Replacethem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence ="Coding is fun, it will be my hobby!!";
		
		String withNoSpaces=sentence.replace(" ", "");
		System.out.println(withNoSpaces);
		
		sentence=sentence.replace("," , "!!!");
		System.out.println(sentence);
		
		String mixed="ˆ*&ˆ%ˆ(*)*&ˆja-v|a%ˆ&*()";
		
		mixed = mixed.replace("ˆ*&ˆ%ˆ(*)*&ˆ", "");
		mixed=mixed.replace("%ˆ&*()", "");
		mixed=mixed.replace("-", "");
		mixed=mixed.replace("|", "");
		
		
		
	
		System.out.println(mixed);

		String result="About 115,000,000 results (0.59 seconds)";
		result=result.replace("About ", "");
		
	result=result.substring(0,result.indexOf(" "));
	System.out.println(result);
		String str="Moscow is a capital of Russia";
	 str=str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
System.out.println(str);	
	
	String email="firstName_LastName@gmail.com";
	String company="deloitte";
	email=email.replace("gmail", company);
	System.out.println(email);
	
	
	
	
	
	
	
	}

}
