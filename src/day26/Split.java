package day26;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String words="java,kava, html,selenium";
		String[] wordsArray=words.split(",");
		System.out.println("Count:"+wordsArray.length);
		System.out.println(Arrays.toString(wordsArray));
		
		
		for(String word:wordsArray) {
			System.out.print(word+" ");
		}
		System.out.println();
		String diceResult="1 - 20 of 1,461 positions";
		String[] result=diceResult.split(" ");
		System.out.println("Search result total:"+result[4]);
		
		String[] diceArray1=diceResult.split("of");
		System.out.println(diceArray1[0].trim());
		System.out.println(diceArray1[1].trim());
		
	String sentence="I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
	String[] Isplit=sentence.split("I");
	String[] allWords=sentence.split(" ");
	String[] HappySplit=sentence.split("happy");
	
	for(String w:allWords) {
		System.out.println(w);
	}
	System.out.println("After happy split");
	for(String w:HappySplit) {
		System.out.println(w);
	}
	System.out.println("After I split");
	for(String w:Isplit) {
		System.out.println(w);
	}
	
	         //  0123
	String word="java";
	char[] chars =word.toCharArray();
	for(char ch:chars){
	System.out.println(ch);
	
	}
	
	
	
	
	
	
	
	
	
	
	}

}
