package day21;
import java.util.Scanner;
public class GetTogherUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
	System.out.println("Enter word");
	
	String word=scan.next();// javva
	String unique="";
	/*for(int i=0;i<word.length();i++) {
		System.out.print(i); //print i , its increases every i by 1
		System.out.println(word.charAt(i));
		*/
		
		for(int i=0;i<word.length();i++) {
			// read a letter and assign
			char letter=word.charAt(i);
		if(!unique.contains(""+letter )) {
			unique+=letter;
		}
		
	}
	System.out.println("Unique:"+unique);
	
	
	
	
	
	}

}
