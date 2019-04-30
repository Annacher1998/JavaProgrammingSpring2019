package day08;
import java.util.Scanner;

public class VoitingEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* programm to tell if you are eligible to vote, 
		 * voitingAge = 18;
		 * yourAge = take from scanner'
		 * you are eligible to vote .
		 * you have been eligible for 3 years
		 * esle 
		 * you are not eligible to vote.
		 * you still have 3 more years to go. 
		 */
		Scanner scan = new Scanner(System.in);
		int voitingAge = 18;
		System.out.println("How old are you?");
		int yourAge = scan.nextInt();
		
		int years = yourAge-voitingAge;
		if(yourAge >= voitingAge)		{
	
			System.out.println("you are eligible to vote .");
 
			System.out.println("you have been eligible for "+ (years)+" years");
 }else {
	 int moreYears = voitingAge-yourAge;
	 System.out.println("you are not eligible to vote.");
//System.out.println("you still have " +(- years) + " more years to go.");
 System.out.println("you still have " +moreYears + " more years to go.");
 }
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
