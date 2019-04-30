package day_14_StringMethod;

public class StringSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="Good Morning";
		if ( str1.equals("Good Morning")){
			System.out.println("Match");
		}else {
			System.out.println("Not match");
		}
		
		if ( str1.equalsIgnoreCase("good morning")) {
		
			System.out.println("Match-ignore case ");
		}else {
			System.out.println("Not match");
		}
		
		//convert to UpperCase
		System.out.println(str1.toUpperCase());
		str1=str1.toUpperCase();
		
		System.out.println("After assigments is become to "+ str1);
		
		// combine above methods together // conver to all lower case first == check if it = goof morning
		if (str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
		}else {
			System.out.println("Chained method : do not match");
		}
		String myName="Anna";
		System.out.println(myName.length());
		
		int length = myName.length();
		System.out.println("My name's length:"+ length);
		
		// username must be exactly 8 characters ;
		String userName= "Anna1998";
		if (userName.length()==8) {
			System.out.println("Valid User Name");	
		}else {
			System.out.println("Invalid User Namer");
		}
		String password="annacher1";
if(password.length()>=6)	{
	System.out.println("Valid password");
}else {
	System.out.println("Invalid password");
}
		int passwordLength=password.length();
		if(passwordLength<6 ) {
			System.out.println("Invalid passwort , too short");
		}else {
			System.out.println("Valid password , good");
		}
		
		
		
		
		
		
	}

}
