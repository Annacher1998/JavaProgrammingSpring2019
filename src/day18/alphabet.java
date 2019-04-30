package day18;

public class alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char letter='a';
		
		while(letter<='z') {
			System.out.println(letter);
		letter++;
		}
		
		System.out.println();  
	
		
		char capitals='A';
		
		while(capitals<='Z') {
			System.out.println(capitals+ " ");
		capitals++;
		}
		System.out.println();
          char reverse='Z';
		
		while(reverse>='A') {
			System.out.print(reverse+ " ");
		reverse--;
		}
		char myLetter='A';
		String letters="";
		
		while(myLetter<='Z') {
		letters=letters+myLetter;
		System.out.println(letters);
		myLetter++;
		}
		
		
		
	}

}
