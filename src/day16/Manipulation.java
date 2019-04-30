package day16;

public class Manipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence="I wrote [236] lines of code today";
		// print the number between [and]
		int start=sentence.indexOf('[')+1;
		int end=sentence.indexOf(']');
		String number=sentence.substring(start,end);
		System.out.println("Lines of code "+ number);
		
		
		int count =Integer.parseInt(number);
	
	if (count>20) {
		System.out.println("Wrote more that 20 lines of code today");
	}else {
		System.out.println("Not enough coding today");
	}
	
	String word2="Coffee cup";
			
	
	
	
	}

}
