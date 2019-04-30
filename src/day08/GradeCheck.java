package day08;
import java.util.Scanner;
public class GradeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A, B , C, D
		// char grade = scan.next().CharAt(0);
		/* if grade is 'A' 
		 * excellent job!Keep it up!
		 * else how many points did you miss for 'A'?
		 * int points = scan.nextInt();
		 * print your grade B is not enough 
		 * you could get 10 more points if you study more,.
		 * 
		 * 
		 */
System.out.println("#### Start");
		Scanner scan = new Scanner(System.in);
		
System.out.println("what is your grade?");		
				char grade = scan.next().charAt(0);
				if ( grade =='A') {
				System.out.println("Excellent job!Keep it up!");
				
				}else { 
					System.out.println("your grade "+ grade+ " is not enough");
					System.out.println("How many points did you miss for 'A'");
					int point= scan.nextInt();
					System.out.println("you could get " + point+ " more points if you study more");
					System.out.println("##### end of the program");
					
					
					
				}
		
		
		
		
		
	}
	

}
