package day08;
import java.util.Scanner;
public class phoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		 Scanner scan = new Scanner(System.in);
		 //-Using concatenation put together in this format and assign to String phoneNumber  variable:-(222)-3334444//
		 //-Write a print statement that displays (use phoneNumber variable ): 
// Calling number (222)-3334444
			
		 
		
		 System.out.println("Enter your Area Code is: ");
		 int areaCode = scan.nextInt();
		
		 System.out.print("Enter your Local number is: ");	 
		 int localNumber = scan.nextInt();
		 
		 String pnoneNumber = "("+ areaCode +")" +"-"+ localNumber;
		 System.out.println("Calling number is: " + pnoneNumber);
				 
		 
		
		
		
		
		
	}

}
