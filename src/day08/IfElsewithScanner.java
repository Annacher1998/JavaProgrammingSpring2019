package day08;
import java.util.Scanner;

public class IfElsewithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// passingPercentage = 65;
		// yourScorePercentage = take form scanner;
		// check if you pass or failed
		
		Scanner scan = new Scanner(System.in);
		
		int passingPercentage = 65;
		System.out.println("Put your score per centage: ");
		int yourScorePercentage = scan.nextInt();
		
		if( yourScorePercentage>=passingPercentage) {
			System.out.println("wow, you pass, congradulations!");
		}else {
			System.out.println("Sorry, you lost!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
