package day20;

public class printEachCharc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Wooden Spoon";
// print each character one by one

		int length = word.length();

		for (int i = 0; i < length; i++) {
			System.out.println(word.charAt(i));
		}
		// using for loop , print only vowel(a,e,o,i,u)
		for (int i = 0; i < length; i++) {
			char letter = word.toLowerCase().charAt(i);
			if (letter == 'a' || letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u') {
				System.out.print(letter + " ,");
			}
		}
		System.out.println();
		for (int i = 0; i < length; i++) {
			char letter = word.toLowerCase().charAt(i);
			if (!(letter == 'a' || letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u')) {
				System.out.print(letter + " ,");
			}
		}
	
	
	
	
	
	
	
	
	
	}

}
