package day24;

public class ArrayOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		char[] values= {'a', 'b', 'c'};
		for(char value:values) {
			System.out.println(value);
		}
	
		String str="Wooden spoon";
		// this method to.CharArray converts string into array of characters
		
		char[] chars=str.toCharArray();
		for(char c:chars) {
			System.out.print(c+"_");
		}
		System.out.println();
		//// ==========REVERSE================
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]);
		}
		
		System.out.println();
		str="";
		
		for(int i=chars.length-1;i>=0;i--) {
			str+=chars[i];
		
		}
		
		System.out.print(str);
		
		// print characters one by one if characters is equals to 'o'replace with '*'
		
		System.out.println();
		char[] letters=str.toCharArray();
		for(char a:letters) {
			System.out.print(a);
		}
		
		
		
		
		
		
		
		
		
		
		

		
		
	}

}
