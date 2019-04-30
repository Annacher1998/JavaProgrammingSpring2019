package day12;
import java.util.Scanner;
public class weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("What weather do you like?");
		String weather=scan.next();
		switch (weather) {
		case "sun":
			System.out.println("Go to park and code Java");
		break;
		case "windy":
			System.out.println("Fly a kite and code java");
		break;
		case "rainy":
			System.out.println("Go shopping") ;
			System.out.println("Code java");
		break;
		case "snow":
			System.out.println("Chain your tires");
			System.out.println("Go skiing and code java");
		break;
		
		default:
			System.out.println("Code java");
		
		}
		
	}

}
