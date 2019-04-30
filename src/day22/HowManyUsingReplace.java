package day22;

public class HowManyUsingReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="including webpages, images";
		// find how many e characters in the word.
		//get the length of word
		// replace all e with empty
		// get the length of word again without e
		//do a minus
		int length=word.length();
		word=word.replace("e","");
		int length1=word.length();
		System.out.println("Length:"+length);
		System.out.println("Length1:"+length1);
		
		int count=length-length1;
		System.out.println("Count of e:"+count);
		
		
		
		
		
		
		
	}

}
