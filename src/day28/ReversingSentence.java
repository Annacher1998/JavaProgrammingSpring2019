package day28;

import java.util.Arrays;

public class ReversingSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence= "You are very interesting person";
		
		String[] reversed=sentence.split(" ");
		System.out.println("Number of words in sentence: "+reversed.length);
		String words="";
		for(int i=reversed.length-1;i>=0;i--) {
			words+=reversed[i]+ " ";
			
		}
		words=words.trim();
		System.out.println(words);
		//System.out.println(words.substring(0,words.length()-1));
		
		
		
		
	}

}
