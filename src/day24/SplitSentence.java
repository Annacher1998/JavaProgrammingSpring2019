package day24;

public class SplitSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String sentence="Java is a general-purpose computer-programming language that is concurrent, class-based, "
				+ "object-oriented, and specifically designed to have"
				+ " as few implementation dependencies as possible.";
			int count=0;	
		String[] words=sentence.split(" ");
		for(String str:words) {
			System.out.println(str);
		if(str.equals("language")) {
			break;
		}
		count++;
		}
		
		System.out.println("Position of language is:"+ count);
		
		System.out.println(words[count]);
		
		
		
		
		
		
		
		
		
		
	}

}
