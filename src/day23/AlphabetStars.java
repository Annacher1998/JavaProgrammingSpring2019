package day23;

public class AlphabetStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// other loop will repeat printing letter as many times as want 
		//in this case we are gonna print 3 times
		for (int i = 1; i < 10; i++) {

			if(i%2==0) {
			for (char letter = 'a'; letter <= 'z'; letter++) {
				System.out.print(letter + " ");

			}
		/// if index is odd (it means 1,3,5),print from z till a
			}else {
			for(char letter='z';letter>='a';letter--) {
				System.out.print(letter+" ");
			}
			}
				System.out.println();
			System.out.println("*****************************************************");
		}
		
		
		
		
		
		
		
		
		
		
		
		
			
	}

}
