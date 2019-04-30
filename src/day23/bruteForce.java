package day23;
import java.util.Scanner;
public class bruteForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
		String expectedPassword="admin123";
		String expectedUserName="admin";
		int attempts=5;
		String username="";
		String password="";
		do {
			
		
		if(attempts==0) {
			System.out.println("You dont have exceeded number at attempts");
		System.out.println("this user  has been deactivated for 5 min");
		return;
		}
		attempts--;
		System.out.println("Please enter username:");
		username=scan.next();
		if(!username.equals(expectedUserName)) {
			System.out.println("Wrong username");
			System.out.println("Attempts left "+attempts);
		
		continue;
		}
		System.out.println("Please enter password:");
		password=scan.next();
		if(!password.equals(expectedPassword)) {
			System.out.println("Wrong  password");
			System.out.println("Attempts left "+attempts);
		 continue;
		}
		
		
		
		
		
		}while(!username.equals(expectedUserName)||!password.equals(expectedPassword));
			
		System.out.println("login seccessful");
		
		
		
		
		
		
		
		
		
	}

}
