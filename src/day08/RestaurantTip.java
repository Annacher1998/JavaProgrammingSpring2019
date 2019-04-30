package day08;
import java.util.Scanner;

public class RestaurantTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// total, serverTip,yourCheck;
		
		// the minimum tip you can put is 20 % of the check
		
		Scanner scan = new Scanner(System.in);
		int total, serverTip, yourCheck;
		System.out.println("Excuse me, mam, can i get my check?");
		System.out.println("How is your check?");
		yourCheck = scan.nextInt();
		System.out.println("Your check is: "+ yourCheck+ "$");
		
		System.out.println("How much do you want leave tip for server?");
		serverTip = scan.nextInt();
		if ( serverTip >= yourCheck*0.18 ) {
			System.out.println("You're a excellent tipper! Congradulations! You made her day.");
		}else { 
			System.out.println("You're a normal tipper, try to  be better ");
		}
			if ( serverTip >= yourCheck * 0.15) {
			System.out.println("You're a bad tipper! Have a good day");
		}else { 
			System.out.println("You're a worst tipper, try be better ");
		}
		
		
		total = yourCheck + serverTip;
		System.out.println("Then your total is: "+ total);
		System.out.println("Thank you for comming");
		
		
	}

}
