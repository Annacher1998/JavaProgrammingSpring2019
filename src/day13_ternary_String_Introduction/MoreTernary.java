package day13_ternary_String_Introduction;

public class MoreTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String quality="bad";
		int rating =(quality.equals("good")) ? 100: 0;
		System.out.println("Rating of quality: "+ rating);
		
		
		System.out.println();
		int hour = 6;
		boolean rushHour =( hour>=4 &&hour<=7)? true:false;
		System.out.println("rush Hour ?-"+ rushHour);
		
	String result1 =(rushHour==true)? "yes":"no";
	System.out.println("Is rush hour true?-"+ result1);
	
		int AMHour=8;
		//6-9
		String amRushHour=(AMHour>=6&&AMHour<=9)? "yes":"no";
		System.out.println("Is it AM Rush hour ? -"+ amRushHour);
		
		
		
	}

}
