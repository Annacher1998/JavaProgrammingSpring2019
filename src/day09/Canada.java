package day09;
import java.util.Scanner;

public class Canada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner ( System.in);

		System.out.println("What is it capital of Canada?");
		String capital = scan.next();
		/*if ( capital.equals("ottawa")) {
			System.out.println("Your answer is correct");
		}else {
			System.out.println("Your answer is not correct");
		}
		*/
		
		if ( capital.equalsIgnoreCase("ottawa")) {
			System.out.println("Your answer is correct");
		}else {
			System.out.println("Your answer is not correct");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
