package day21;

public class ConvertCharToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		String str1 = "" + ch;
		System.out.println(ch);
		char ch2 = 'v';
		// following ways can be using to convert char to String
		String str2 = new String("" + ch2);
		
		String str3 = Character.toString(ch2);
		
		
		System.out.println(str2);
		System.out.println(str3);
	
	
	
	
	
	
	
	
	}

}
