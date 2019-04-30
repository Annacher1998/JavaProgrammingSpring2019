package day30;
import java.util.*;
public class print5Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fivestar();
		//CALL THE METHOD 100 TIMES
		
		for(int i=0;i<101;i++) {
			Fivestar();
		
		}
		introduce();
	}
		
		public static void Fivestar() {
			System.out.println("******");
			
			
		}
		public static void introduce() {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter your name: ");
			String name=scan.next();
			System.out.println("Nice to meet you, "+ name);
		}
		
		
	

}
