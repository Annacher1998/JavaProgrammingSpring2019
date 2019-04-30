package day35;

public class decrypMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decryptChar('z'));
		System.out.println(decryptChar('m'));
		System.out.println(decryptWord("poieer"));
		System.out.println(decryptSentence("gszmp blf nfilwro"));
	}
	public static char  decryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		//encrypted.charAt(alphabet.indexOf(ch));
		int i=encrypted.indexOf(ch);
		char et=alphabet.charAt(i);
		return et;
		
	}
	public static String decryptWord(String word) {
		
		String converted="";
		
		for(int i=0;i<word.length();i++) {
		converted+=decryptChar(word.charAt(i));
			
		}
		return converted;
	}
	/*
	 * encryptSentence
	 * return type: String
	 * param: String sentence
	 * Split the sentence by space and call encryptWord and 
	 * return encrypted sentence
	 */
	public static String decryptSentence(String sentence ) {
		
		String[] sentence1=sentence.split(" ");
		String returnValue="";
		for(String str:sentence1) {
			returnValue+=decryptWord(str)+" ";
					
		}
		return returnValue.trim();
		
	}
}
