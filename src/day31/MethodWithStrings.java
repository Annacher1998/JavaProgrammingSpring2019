package day31;
import java.util.*;
import java.util.Arrays;

public class MethodWithStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
countWords("Java is fun");
googleSearch("About 121,000,000 results (0.75 seconds)");
	}
public static void countWords(String sentence) {
	String[] words=sentence.split(" ");
	String word1=Arrays.toString(words);
	System.out.println("Words in this sentence: "+word1);
	System.out.println("Number of words: "+ words.length);
	
}
	public static void googleSearch(String result) {
		//result="About 121,000,000 results (0.75 seconds)";
		String[] result1=result.split(" ");
		System.out.println(Arrays.toString(result1));
		//String count="Result count: "+result.substring(result.indexOf(" "),result.indexOf(" r"));
		//String time=("Time taken: "+result.substring(result.indexOf("(")+1,result.lastIndexOf(")")));
		String count=result1[1].replace(",","");
		String time=result1[3].replace("(","");
		System.out.println("Result count: "+count);
		System.out.println("Time taken in seconds: "+time);
	}
	
	
	
	
}
