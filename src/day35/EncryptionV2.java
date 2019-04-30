package day35;

public class EncryptionV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(encryptChar('z'));
		System.out.println(encryptChar('m'));
		System.out.println(encryptWord("mama"));
		System.out.println(encryptSentence("i love java"));
	}
public static char  encryptChar(char ch) {
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	String encrypted ="zyxwvutsrqponmlkjihgfedcba";
	//encrypted.charAt(alphabet.indexOf(ch));
	int i=alphabet.indexOf(ch);
	char et=encrypted.charAt(i);
	return et;
	
}
public static String encryptWord(String word) {
	//String alphabet = "abcdefghijklmnopqrstuvwxyz";
	//String encrypted ="zyxwvutsrqponmlkjihgfedcba";
	String cyphered="";
	for(int i=0;i<word.length();i++) {
	cyphered+=encryptChar(word.charAt(i));
		
	}
	return cyphered;
}
/*
 * encryptSentence
 * return type: String
 * param: String sentence
 * Split the sentence by space and call encryptWord and 
 * return encrypted sentence
 */
public static String encryptSentence(String sentence ) {
	
	String[] sentence1=sentence.split(" ");
	String returnValue="";
	for(String str:sentence1) {
		returnValue+=encryptWord(str)+" ";
				
	}
	return returnValue.trim();
	
}
}
