package day23;

public class printNumbersWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//outer loop
		for (int i = 1; i <= 10; i++) {
			// inner loop

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	
		
		//////////////REVERSE////////////
	
	for (int m = 10; m >=1;m--) {
		// inner loop

		for (int a = m; a >=1; a--) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
		
		
		
		
	}	

}
