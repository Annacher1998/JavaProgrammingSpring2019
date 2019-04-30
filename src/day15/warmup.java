package day15;

public class warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String emoji=":)";

if(emoji.length()!=2) {
	System.out.println("invalid emoji");
return;
}
		char first = emoji.charAt(0);
		char second=emoji.charAt(1);
		
	
		// if code reaches this point , then emoji is 2 chars.
	if(first==':'&&second==')') {
		System.out.println("smile");
	
	}else if (first==';'&&second=='(')	{
		System.out.println("sad");
	
	}else if( first==':'&& second=='/') {
System.out.println("upset");
	
	}else if(first==':'&&second=='p') {
	System.out.println("playful");
	
	
	}
	else if(first=='('&& second==':'){
		System.out.println("still sad");
	} else {
		System.out.println("Invalid emoji");
	
	}
	}
}
