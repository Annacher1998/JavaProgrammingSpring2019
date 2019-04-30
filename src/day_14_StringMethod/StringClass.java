package day_14_StringMethod;
import java.util.Scanner;
public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Print two words:");
String word1=scan.next();
String word2=scan.next();
      
if(word1.length()>word2.length()) {
	System.out.println("word1Value is longer");
}else if( word2.length()>word1.length()) {
	System.out.println("word2Value is longer");
}else {
	System.out.println("Word1Value and word2Value are same length");
}











	}

}
